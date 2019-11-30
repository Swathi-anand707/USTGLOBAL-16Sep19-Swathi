package com.ustglobal.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.empwebapp.dto.Employee_info;

public class EmployeeDaoJdbcImpl implements EmployeeDao{


	private static final  String URL ="jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=swathi";
	private static final  String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final  String SELECT_SQL ="select * from employee_db where id = ?"; 
	private static final  String INSERT_SQL = "insert into employee_db values(?,?,?,?)";
	private static final  String UPDATE_SQL ="update employee_db set password =? where id = ?";
	@Override
	public Employee_info auth(int id, String password) {
		/*
		 *  this is for authentication 
		 * String sql ="select * from employee_info where id = ? password = ?";
		 */

		Employee_info info = searchEmployee(id); 
		//get the employee object through id
		if(info!= null) { 
			// if its true object exist
			String pass= info.getPassword(); 
			// so we can get the password
			if(pass.equals(password)) { 
				// comparing original pswd with current pswd
				return info;     
				// if its true get the employee info object
			}else {
				return null;
			}
		}

		return null;
	}

	@Override
	public Employee_info searchEmployee(int id) {

		try {
			Class.forName(DRIVER_CLASS_NAME);
			try (Connection conn =DriverManager.getConnection(URL);
					PreparedStatement pstmt= conn.prepareStatement(SELECT_SQL)){
				pstmt.setInt(1,id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						Employee_info info = new Employee_info();

						info.setId(rs.getInt("id"));
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));

						return info;
					}else {
						return null;
					}
				}

			}

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}//end of trycatch

	}// end of main

	@Override
	public boolean changePassword(int id, String password) {


		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(URL);
					PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL)){

				pstmt.setString(1,password);
				pstmt.setInt(2, id);
				int count =pstmt.executeUpdate( );
				/*
				 * boolean check = count>0 ? true: false; return check;
				 */

				if(count>0) { 
					return true; 
				}else {
					return false; 

				}


			}

		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}


	}

	@Override
	public boolean registerEmployee(Employee_info info) {

		try {
			Class.forName(DRIVER_CLASS_NAME);

			try(Connection conn = DriverManager.getConnection(URL);
					PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL))
			{

				pstmt.setInt(1, info.getId());
				pstmt.setString(2, info.getName());
				pstmt.setString(3, info.getEmail());
				pstmt.setString(4, info.getPassword());

				int count = pstmt.executeUpdate();
				if(count>0) {
					return true;
				}else {
					return false;
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}


}
