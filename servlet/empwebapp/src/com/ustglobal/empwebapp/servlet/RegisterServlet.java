package com.ustglobal.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebapp.dao.EmployeeDao;
import com.ustglobal.empwebapp.dto.Employee_info;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Employee_info info = new Employee_info();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		// set the or take info from user
		EmployeeDao dao = EmployeeDaoManager.getEmployeeDAO();
		boolean check = dao.registerEmployee(info);
		
		PrintWriter out = resp.getWriter();
		String msg="";
		if(check) {
			
			msg="Registration completed";
//			out.println("<html>");
//			out.println("<h4> Registeration completed</h4>");
//			out.println("</html>");
		}else {
			msg="Id cannot be repeated";
//			out.println("<html>");
//			out.println("<h4> id cann't be repeated</h4>");
//			out.println("</html>");
		}
		req.setAttribute("msg", msg);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp); // if registration completed then its go to login page
		
		
		
	}
	
	

}
