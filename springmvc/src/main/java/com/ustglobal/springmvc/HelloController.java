package com.ustglobal.springmvc;

import java.text.SimpleDateFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller

public class HelloController {

	/*public String hello(ModelMap map) {
		map.addAttribute("msg", "hello word");

		return "index";

	}*/
	@InitBinder
	public void InitBinder(WebDataBinder binder) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(java.util.Date.class, editor);

	}
	@RequestMapping(path="/hello")
	public String hello(@RequestParam("name")String name,
			@RequestParam("id")int id,
			ModelMap map) {
		map.addAttribute("msg", "hello word");
		map.addAttribute("name", name);
		map.addAttribute("id", id);
		return "index";

	}

	@RequestMapping(path="/hi/{name}/{id}")
	public String hi(@PathVariable("name")String name,
			@PathVariable("id")int id,HttpServletRequest request) {
		request.setAttribute("msg", "hello java word");
		request.setAttribute("name", name);
		request.setAttribute("id", id);


		return "index";

	}

	@RequestMapping(path="/form")
	public String formPage() {


		return "form";

	}
	@RequestMapping(path="/form", method=RequestMethod.POST)
	/*
	 * public String form(int id, String name, String password, String gender,
	 * ModelMap map)
	 */
	public String form(Employee emp, ModelMap map) {
		map.addAttribute("id", emp.getId());
		map.addAttribute("name", emp.getName());
		map.addAttribute("password", emp.getPassword());
		map.addAttribute("gender", emp.getGender());
		map.addAttribute("doj", emp.getDoj());

		return "formOutput";
	}
	@RequestMapping(path="/createCookie")
	public String createCookie(ModelMap map, HttpServletResponse response) {
		Cookie cookie = new Cookie("name", "KalliPriya");
		response.addCookie(cookie);
		return "createCookie";

	}
	@RequestMapping(path="/readCookie")
	public String readCookie(ModelMap map , @CookieValue("name") String name) {
		map.addAttribute("name",name);
		return "readCookie";

	}
	@RequestMapping(path="/redirect")
	public String redirect() {
		return "redirect: https://www.google.com";
	}
	@RequestMapping(path="/forward")
	public String forward() {
		return "forward:./hi/swathi/1";       // redirect to same page
	}
}
