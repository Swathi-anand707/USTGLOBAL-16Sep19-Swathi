package com.ustglobal.assignment;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectQue {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2 Establish the connection or get the connection 
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?" + "user=root&password=swathi";
			conn = DriverManager.getConnection(url);

			//step 3 create the statement or platform 
			stmt = conn.createStatement();

			/*
			 * which is interface so we cannot create object which present in connection
			 * interface// signature of statements public abstract statement
			 * createStattement(){}
			 */

			//step 4 issue the sql Query
			String sql ="select * from employee";
			res = stmt.executeQuery(sql);
			/*
			 * signature of resultSet public abstract statement createStattement(){} returns
			 * object of type result set
			 * it checks whether  row exist or not
			 */

			while(res.next()) {
				int id = res.getInt(1);
				String name = res.getString("name");
				int sal= res.getInt("sal");
				String gender = res.getString("gender");

				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("salary is "+sal);
				System.out.println("gender is "+gender);
				System.out.println("*****************************");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!=null) {
					conn.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
				if (res!=null) {
					res.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}


}
