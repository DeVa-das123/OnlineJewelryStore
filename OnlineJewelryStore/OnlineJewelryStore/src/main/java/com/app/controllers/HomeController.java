package com.app.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.IProductService;

@Controller
public class HomeController {
	@Autowired
	IProductService productService;
	public HomeController() {
		System.out.println("In HomeControllers Constuctor");
	}
	
	@RequestMapping("/")
	public String showWelcomePage(HttpSession session){
	System.out.println("In welcome page");
	/*
	 * List<Product> products = productService.getAllProducts();
	 * session.setAttribute("product_list", products);
	 */
		return "/index";
	}
	
}
