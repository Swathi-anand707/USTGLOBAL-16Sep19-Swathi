package com.ustglobal.productapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;


import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;
import com.ustglobal.productapp.dao.ProductDao;

import com.ustglobal.productapp.repo.RetailerService;
@Controller

public class RetailerController {
	@Autowired
	private RetailerService service;
	private ProductDao dao1;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/login")
	public String LoginPage() {
		return "login";
	}// end of login page
		// which creates the session object once we login

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest req) {
		service.login(id, password);
		Retailer bean = service.login(id, password);
		if (bean == null) {
			req.setAttribute("msg", "Invalid Credential");
			return "login";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}// end of login

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}// end of registerpage

	@PostMapping("/register")
	public String register(Retailer bean, ModelMap map) {
		int check = service.register(bean);
		if (check > 0) {
			map.addAttribute("msg", "Registered Successfully and Id is: " + check);
		} else {
			map.addAttribute("msg", "Email should be unique");
		}
		return "login";
	}// end of register

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required = false) Retailer bean) {

		if (bean == null) {
			map.addAttribute("msg", "login first");
			return "login";
		} else {
			return "home";

		}

	}// end of home

	@PostMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/search")
	public String search(@RequestParam("pid") int pid, ModelMap map) {

		Product bean = dao1.searchProduct(pid);
		if (bean == null) {
			/* if id not found print this msg */
			map.addAttribute("msg", "Product not found");

		} else {
			/* if found which display the table */
			map.addAttribute("bean", bean);

		}
		return "home";

	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout
	
	
	@GetMapping("/changePassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session= request.getSession(false);
		if(session!=null) {
			return "changePassword";
		}else {
			return "login";
		}
		
		
	}
	@PostMapping("/changePassword")
	public String changePassword(String password, String newPassword,
			@SessionAttribute(name = "bean") Retailer bean, ModelMap map) {
		
		if(password.equals(newPassword)) {
			service.changePassword(bean.getId(), newPassword);
			map.addAttribute("msg", "Password changed");		
		}else {
			map.addAttribute("msg", "password not matching");			
		}
		return "home";
	}
		
	@GetMapping("/update")
	public String update(HttpServletRequest req, Retailer bean) {
		HttpSession session =req.getSession(false);
		if(session!=null) {
			return "update";
		}else {
			return "login";
		}
		
	}
		
		
	
	@PostMapping("/update")
	public  String update(String name,String password,
			@SessionAttribute(name = "bean", required = false) Retailer bean) {
		
		bean.setName(name);
		bean.setPassword(password);
		service.upadteRetailer(bean);
		return "home";
		
	
	
}// end of register


}
