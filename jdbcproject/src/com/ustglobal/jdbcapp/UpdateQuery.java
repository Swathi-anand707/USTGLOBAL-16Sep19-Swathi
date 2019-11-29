package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?" + "user=root&password=swathi";
			conn = DriverManager.getConnection(url);
			
			String sql = "update employee set name = 'ABC', sal =50, gender='O' where id=6 ";
			
			stmt = conn.createStatement();
			
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + " Row(s) effected");
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
