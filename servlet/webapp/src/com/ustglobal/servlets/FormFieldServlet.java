package com.ustglobal.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormFieldServlet extends HttpServlet{



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		PrintWriter out = resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
			conn= DriverManager.getConnection(url,"root","swathi");
			pstmt = conn.prepareStatement("select * from employee where id =?");
			pstmt.setString(1,id);
			res =pstmt.executeQuery();



			out.println("<table>");
			out.println("<thead>");
			out.println("<th>id</th>");
			out.println("<th>name</th>");
			out.println("<th>sal</th>");
			out.println("<th>gender</th>");
			out.println("</thead>");






			while(res.next()) {

				out.println("<tbody>");

				out.println("<tr>");

				out.println("<td>");
				out.println(res.getInt(1));
				out.println("</td>");



				out.println("<td>");
				out.println(res.getString(2));
				out.println("</td>");



				out.println("<td>");
				out.println(res.getInt(3));
				out.println("</td>");



				out.println("<td>");
				out.println(res.getString(4));
				out.println("</td>");

				out.println("</tr>");


				out.println("</tbody>");



			}

			out.println("</table>");	




		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(res!=null) {
					res.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}	
}
