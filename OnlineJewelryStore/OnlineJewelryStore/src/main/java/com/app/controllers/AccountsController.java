package com.app.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.User;
import com.app.service.IUserService;

@Controller
@RequestMapping("/accounts")
public class AccountsController {
	@Autowired
	IUserService service;

	public AccountsController() {
		System.out.println("in accounts Controller constructor");
	}

	@GetMapping("/register")
	public String showRegisterForm() {
		System.out.println("in Show register form");

		return "/accounts/register";
	}

	@PostMapping("/register")
	public String processRegistserForm(Model map, @RequestParam String fname, @RequestParam String lname,
			@RequestParam String address, @RequestParam String em, @RequestParam String pass,
			@RequestParam String role) {

		System.out.println("in User process register form");
		User newUser = new User(fname, lname, pass, em, address, role);
		try {
			String regstatus = service.registerUser(newUser);
			map.addAttribute("regstatus", regstatus);
		} catch (Exception e) {
			e.printStackTrace();
			String regstatus = "User Registration Fail";
			map.addAttribute("regstatus", regstatus);

		}
		return "/accounts/regstatus";
	}

	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("In showlogin Form");
		return "/accounts/login";
	}

	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String password, @RequestParam String role,
			HttpSession session) {

		try {

			System.out.println("In processLoginForm");
			User validatedUser = service.validateUser(email, password);
			session.setAttribute("user_details", validatedUser);//adding the user details to session and using in home of customer
			System.out.println("Login sucessfull user validated");
			if (validatedUser.getUserRole().equals("customer")) {

				return "redirect:/customer/home";

			} else if (validatedUser.getUserRole().equals("admin")) {
				return "redirect:/admin/home";// "redirect:/admin/shopsdetails";
			}

		} catch (Exception e) {
			System.out.println("err in controller " + e);

			return "/accounts/login";
		}
		return "/accounts/login";
	}
	
	

}
