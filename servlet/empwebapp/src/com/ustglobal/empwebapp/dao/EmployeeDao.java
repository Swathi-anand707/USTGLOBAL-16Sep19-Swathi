package com.ustglobal.empwebapp.dao;

import com.ustglobal.empwebapp.dto.Employee_info;

public interface EmployeeDao {
	
	public Employee_info auth(int id, String password);
	
	public Employee_info searchEmployee(int id);
	
	public boolean changePassword(int id, String password);
	
	public boolean registerEmployee(Employee_info info);

}
