package com.app.controllers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Card;
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.service.ICardService;
import com.app.service.IProductService;
import com.app.service.IUserService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	IProductService productService;
	@Autowired
	IUserService userService;
	@Autowired
	ICardService cardService;

	public CustomerController() {
		System.out.println("In customer Controller");
	}

	@GetMapping("/home")
	public String showHomePage(HttpSession session,HttpSession sess) {
		System.out.println("In" + getClass().getName());
		List<Product> products = productService.getAllProducts();
		session.setAttribute("product_list", products);
		
		List<Product> cart = new ArrayList<Product>();
		sess.setAttribute("shoppingcart", cart);

		return "/customer/home";

	}

	@GetMapping("/cart")
	public String addtoCart(@RequestParam int prodId, HttpSession sess) {
		System.out.println("in " + getClass().getName());
		Product productSelected = productService.getProductById(prodId);
		System.out.println("selected product:" + productSelected);
		// List<Product> cart=(List<Product>)sess.getAttribute("shoppingcart");
		@SuppressWarnings("unchecked")
		List<Product> cart = (List<Product>) sess.getAttribute("shoppingcart");
		cart.add(productSelected);

		return "/customer/home";
	}

	@GetMapping("/shoppingcart")
	public String cart() {
		return "/customer/cart";
	}

	@GetMapping("/order")
	public String showOrderForm(@RequestParam int prodId, Model map) {

		System.out.println("in " + getClass().getName());

		Product selectedProduct = productService.getProductById(prodId);

		map.addAttribute("theProduct", selectedProduct);

		return "/customer/order";
	}

	@PostMapping("/order")
	public String processOrderForm(@RequestParam int uId,
			@RequestParam int pId, @RequestParam Double price,
			@RequestParam String paymentMode, 
			@RequestParam String address, @RequestParam String quantity,HttpSession session) {
		//Model map,

		System.out.println("in " + getClass().getName());
		Double qty = Double.parseDouble(quantity);

		System.out.println("userid" + uId);
		userService.updateAddress(uId, address);// for new address changes done in userService
		Product selectedProduct = productService.getProductById(pId);// getting product by id of it

		Double total = qty * price;

		Date date = new Date();
		LocalDate CurrentDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate : " + CurrentDate);

		Order o = new Order("confirm", total, paymentMode, "Paid", CurrentDate, selectedProduct);
		
		productService.placeOrder(o);
		selectedProduct.addOrder(o);
		
		/*
		 * List<Order> orders=selectedProduct.getOrders();
		 * 
		 * for(Order o1:orders) { System.out.println("orders in product::"+o1); }
		 */
		 
         // map.addAttribute("order", o);
		session.setAttribute("order_details", o);
          
		return "/customer/orderdetails";//customer/orderdetails
	}
	@GetMapping("/orderdetails")
	public String showOrderDetails() {
		
		
		return "redirect:/customer/payment";///customer/payment
	}
	
	@GetMapping("/myorders")
	public String myOrders() {

		System.out.println("in"+getClass().getName());
		
		return "/customer/myorders";
	}

	@GetMapping("/payment")
	public String payementForm() {
		
		

		return "/customer/payment";//redirect:/admin/home
	}
	
	
	@PostMapping("/payment")
	public String payementProcessingForm(@RequestParam int cardNo,
			@RequestParam String name,@RequestParam int cvv) {
  
		Card newCard=new Card(cardNo, name, cvv);
		cardService.saveCardDetails(newCard);
		
		return "redirect:/customer/paymentstatus";
	}
	@GetMapping("/paymentstatus")
	public String showPayementStatus() {
		System.out.println("in"+getClass().getName());
		return   "/customer/paymentstatus";
		
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("In " + getClass().getName());
        session.invalidate();
         
		return "redirect:/";
	}

}
