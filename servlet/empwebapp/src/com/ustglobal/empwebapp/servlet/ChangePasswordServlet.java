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

import com.ustglobal.empwebapp.dao.EmployeeDao;
import com.ustglobal.empwebapp.dto.Employee_info;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;
@WebServlet("/changePassword")
public class ChangePasswordServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession (false);
		if(session!=null) {// if passsword matches which gives some response
			String pass = req.getParameter("password");
			String confirmPass =req.getParameter("confirmPassword");
			if(pass.equals(confirmPass)) {
				Employee_info info = (Employee_info)session.getAttribute("info");
				EmployeeDao dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);

			}else {
				// if password does not match
				//				PrintWriter out = resp.getWriter();
				//				out.println("<html>");
				//				out.println("<h4> Password not matching</h4>");
				//				out.println("</html>");
				//				RequestDispatcher dispatcher = req.getRequestDispatcher("/changePassword.html");
				//				dispatcher.include(req, resp);
				String msg="password not mathing";
				req.setAttribute("msg", msg);
				//				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changePassword.jsp");
				dispatcher.forward(req, resp);
			}

		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
