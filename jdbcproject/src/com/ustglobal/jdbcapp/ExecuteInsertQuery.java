package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection conn =null;
	Statement stmt =null;
	try {
		// step 1 load the driver		
		Class.forName("com.mysql.jdbc.driver");
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?" + "user=root&password=swathi";
		conn =DriverManager.getConnection(url);
		
		String sql = " insert into employee " + " values (6,'Akshu',75000,'F') ";
		stmt = conn.createStatement();
		
		int count = stmt.executeUpdate(sql);
		
		//step 4 read the result
		System.out.println(count+ "   rows inserted");
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
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
	
	
}// end of main
}// end of class
