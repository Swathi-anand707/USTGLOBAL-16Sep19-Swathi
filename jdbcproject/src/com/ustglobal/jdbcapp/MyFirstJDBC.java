package com.ustglobal.jdbcapp;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
		
			/* step 1 load and register the driver */
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);			
			/* step 2 Establish the connection or get the connection */
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?" + "user=root&password=swathi";
			conn = DriverManager.getConnection(url);			
			/*
			 *  step 3 create the statement or platform
			 *  which is interface so we cannot create object
			 *  which present in connection interface
			 *   signature of statements public abstract statement createStattement(){}
			 */					
			stmt = conn.createStatement();		
			/*
			 * step 4 issue the sql Query
			 */			
			String sql ="select * from employee";
			/*
			 * signature of resultSet public abstract statement createStattement(){} returns
			 * object of type result set
			 * step 5 read or process the resultant
			 */
			rs = stmt.executeQuery(sql);
			/* it checks whether next row exist or not */
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int sal= rs.getInt("sal");
				String gender = rs.getString("gender");
				
				
				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("salary is "+sal);
				System.out.println("gender is "+gender);
				System.out.println("*****************************");
			}
			
			
			
			/*
			 * if----we have only one line of code while - we have more than one line of
			 * code and which is present in get method blob --- whic is used to store any
			 * fine
			 * 
			 * rs.next(); on;y one row will be executes int id = rs.getInt("id"); String
			 * name = rs.getString("name"); int sal= rs.getInt("sal"); String gender =
			 * rs.getString("gender");
			 * 
			 * 
			 * System.out.println("id is "+id); System.out.println("name is "+name);
			 * System.out.println("salary is "+sal);
			 * System.out.println("gender is "+gender);
			 * System.out.println("*****************************");
			 */
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			/*
			 * step 6 close all the costly reaources or Jdbc object
			 */		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					conn.close();
				}
				if(rs!=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
				
				
			}
		}
	}//end of main

}// end of project
