package com.app.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Product;
import com.app.pojos.User;
import com.app.service.IProductService;
import com.app.service.IUserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	IProductService productService;
	@Autowired
	IUserService userService;

	public AdminController() {
		System.out.println("in constructor of AdminController"+getClass().getName());
	}

	@GetMapping("/home")
	public String showHomePage(HttpSession session) {

		System.out.println("In home Page of adminController");
		 List<Product> products = productService.getAllProducts();
		 session.setAttribute("product_list1", products);
		return "/admin/home";
	}

	@GetMapping("/addproduct")
	public String showAddProductFrom() {
		System.out.println("In show product form"+getClass().getName());

		return "/admin/addproduct";
	}

	@PostMapping("/addproduct")
	public String processAddProductForm(@RequestParam String proName, @RequestParam String proDescription,
			@RequestParam double proPrice, @RequestParam String proImageUrl, @RequestParam String proCategory,
			Product populatedProduct, HttpSession sess) {// RedirectAttributes flashMap,

		try {
			populatedProduct = new Product(proName, proDescription, proPrice, proImageUrl, proCategory);
			System.out.println("in show pro" + populatedProduct);
			// flashMap.addFlashAttribute("status",

			productService.addProduct(populatedProduct);


			return "redirect:/admin/home";
		}

		catch (Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
			return "/admin/addproduct";// view name according to folder structure
		}
	}

	@GetMapping("/productreport")
	public String showProductReport(HttpSession session) {
		System.out.println("In show Product report"+getClass().getName());
		return "/admin/productreport";
	}

	@GetMapping("/delete")
	public String deleteProduct(@RequestParam int prodId, RedirectAttributes flashMap) {
		System.out.println("in delete products");
		flashMap.addFlashAttribute("status", productService.deleteProduct(prodId));
		return "/admin/productdeletestatus";

	}

	@GetMapping("/update")
	public String updateProductForm(@RequestParam int prodId, Model map) {
		System.out.println("In updateProductsForm" + getClass().getName());
		Product product = productService.getProductById(prodId);
		System.out.println("Vegetable" + product);
		map.addAttribute("updateproductdetails", product);
		return "/admin/updateproduct";
	}

	@PostMapping("/update")
	public String processUpdateProductFrom(@RequestParam int prodId, @RequestParam String proName,
			@RequestParam String proDescription, @RequestParam String proCategory, @RequestParam double proPrice,
			@RequestParam String proImgUrl,

			RedirectAttributes flashmap) {

		System.out.println("in " + getClass().getName());
	
		Product updateProduct = new Product(prodId, proName, proDescription, proPrice, proImgUrl, proCategory);
		if (productService.updateProduct(updateProduct) != null)

		{
			flashmap.addFlashAttribute("updateproductstatus", "Successfully updated");
		} else {
			flashmap.addFlashAttribute("updateproductstatus", "product updation failed");
		}
		return "redirect:/admin/home";

	}
	
	@GetMapping("/customerreport")
	public String showCustomerReport(Model map) {
		
		List<User> users=userService.getAllUsers();
		map.addAttribute("all_users", users);
		return "/admin/customerreport";
	}
	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam int userId) {
		System.out.println("in delete User"+getClass().getName());
		//flashMap.addFlashAttribute("status", productService.deleteProduct(userId));
		userService.deleteUserById(userId);
		return "redirect:/admin/home";

	}
	
	@GetMapping("/logout")
	public String logout() {
		System.out.println("In " + getClass().getName());

		return "redirect:/";
	}

}
