package com.ustglobal.productapp.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.productapp.beans.OrderProduct;
import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;
import com.ustglobal.productapp.repo.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginpage(String email,String password,HttpServletRequest request) {
		Retailer user=service.login(email, password);
		if(user!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			return "home";
		}else {
			request.setAttribute("msg", "Invalid email or password");
			return "login";
		}
	}
	
	@GetMapping("/register")
	public String registerPage() {

		return "register";
	}

	@PostMapping("/register")
	public String register(Retailer bean,ModelMap map) {
		boolean check=service.register(bean);
		if(check) {
			map.addAttribute("msg", "Your Registered");
		}else {
			map.addAttribute("msg", "Email is Repeated");
		}
		return "login";
	}
	@GetMapping("changepassword")
	public String change(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}
	@PostMapping("changepassword")
	public String change(@SessionAttribute(name= "user", required = false) Retailer user,ModelMap map,String password) {
		if(user!=null) {
			service.updatePassword(user.getEmail(), password);
			map.addAttribute("msg", "password changed");
			return "home";
		}else {
			map.addAttribute("msg", "Login First");
			return "login";
		}
	}
	@GetMapping("/search")
	public String search() {
		
		return "searchproduct";
	}
	@PostMapping("/search")
	public String searchproduct(@SessionAttribute(name= "user", required = false) Retailer user,ModelMap map,String pname) {
		if(user!=null) {
			
			Product product=service.search(pname);
			if(product!=null) {
			map.addAttribute("product",product);
			return "searchproduct";
			}else {
				map.addAttribute("msg", "product not found");
				return "searchproduct";
			}
		}else {
			map.addAttribute("msg", "First Login!!!");
		return "login";
		}
	}
	@GetMapping("/buy")
	public String buy(@SessionAttribute(name= "user", required = false) Retailer user,ModelMap map,Product product) {
		if(user!=null) {
			map.addAttribute("buy", product);
			return "buyproduct";
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	}
	@PostMapping("/buy")
	public String buyproduct(@SessionAttribute(name= "user", required = false) Retailer user,ModelMap map,Product product, int quantity) {
		if(user!=null) {
			service.buyProduct(user, product, quantity);
			map.addAttribute("msg", "product added");
			return "home";
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout
	
	@GetMapping("/update")
	public String update(HttpServletRequest req, Retailer user) {
		HttpSession session =req.getSession(false);
		if(session!=null) {
			return "update";
		}else {
			return "login";
		}
		
	}
		
	@GetMapping("/order")
	public String order(@SessionAttribute(name= "user", required = false) Retailer user,ModelMap map) {
		if(user!=null) {
			List<OrderProduct> list=service.getProducts(user.getEmail());
			if(list.isEmpty()) {
				map.addAttribute("msg", "No Product You Have");
				return "home";
			}else {
				map.addAttribute("orders", list);
				return "orders";
			}
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}	
	}

	
}// end of register

