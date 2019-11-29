package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJdbcWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try{
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			/*
			 *  step 1 load and register the driver
			 */			
			Class.forName("com.mysql.jdbc.Driver");

			/* step 2 Establish the connection or get the connection */
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);


			/* step 3 create the statement or platform 
			 * which is interface so we cannot create object which present in connection interface
			 *  signature of statements public abstract statement createStattement(){}
			 */
			stmt = conn.createStatement();


			//step 4 issue the sql Query
			String sql ="select * from employee";

			/*
			 * signature of resultSet public abstract statement createStattement(){}
			 * returns object of type result set
			 * step 5 read or process the resultant
			 * it checks whether  row exist or not
			 */			
			rs = stmt.executeQuery(sql);
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
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();


			}
		}
	}//end of main

}
