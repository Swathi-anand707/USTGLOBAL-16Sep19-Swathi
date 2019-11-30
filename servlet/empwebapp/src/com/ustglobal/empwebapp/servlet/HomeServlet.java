package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dto.Employee_info;
@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);// which checks jsession id present or not and valid or not(using jsession id)
		if(session!=null) {//if its true which gives the welcome page
			//			Employee_info info = (Employee_info)session.getAttribute("info"); // intead of writing here we can write it in jsp file using request attribut
			//			PrintWriter out = resp.getWriter();
			//			out.println("<h1> Welcome "+info.getName());
			//			out.println("</h1>");
			//			out.println("<a href='./search.html'>search</a>");
			//			out.println("<a href='./changePassword.html'>changePassword</a>");
			//			out.println("<a href='./logout'>Logout</a>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req,resp);

		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req,resp);
		}

	}// end of doget
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}// end of dopost


}
