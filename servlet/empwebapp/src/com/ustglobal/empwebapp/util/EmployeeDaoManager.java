package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebapp.dao.EmployeeDao;
import com.ustglobal.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}

	public static EmployeeDao getEmployeeDAO() {
		return new  EmployeeDaoJdbcImpl();

	}

}
