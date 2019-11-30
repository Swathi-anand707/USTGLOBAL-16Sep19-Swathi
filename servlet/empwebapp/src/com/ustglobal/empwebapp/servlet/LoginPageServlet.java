package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id ="";
		Cookie[] cookies =req.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().contentEquals("alwaysRemember")) {
					id =cookie.getValue();
				}

			}
		}








		out.println("<html>");
		out.println("<body>");
		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action=' ./login'  method ='post'>");
		out.println(" <table align='center'>");
		out.println("<tr>");
		out.println("<td>Id:</td>");
		out.println("<td><input  name = 'id' type = 'number'value='"+id+"'> </td>");
		out.println("</tr>");
		out.println(" <td>Password:</td>");
		out.println("<td><input  name = 'password' type = 'password' ></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println(" <td><input  name = 'rememberme' type = 'checkbox'  value='checked'></td>");
		out.println("<td> Remember me</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println(" <td><input  type = 'submit' value = 'login' ></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><a href='register.html'> Register</a></td>");
		out.println(" </tr>");
		out.println(" </table>");
		out.println(" </form>");
		out.println(" </fieldset>");
		out.println("</body>");
		out.println("</html>");
	}


}
