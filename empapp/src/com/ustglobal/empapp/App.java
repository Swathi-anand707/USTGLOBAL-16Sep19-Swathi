package com.ustglobal.empapp;


import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch(ch) {
		case 1 :
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getEmployeeData();

			for (EmployeeBean bean : result) {

				System.out.println("Id is : "+bean.getId());
				System.out.println("Name is : "+bean.getName());
				System.out.println("Sal is :"+bean.getSal());
				System.out.println("Gender is :" +bean.getGender());
			}
			break;
		case 2 :

			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean2 = new EmployeeBean();
			System.out.println("Enter Id");
			int id2 = scn.nextInt();
			bean2.setId(id2);

			System.out.println("Enter the name");
			String name = scn.next();
			bean2.setName(name);

			System.out.println("Enter salary");
			int sal = scn.nextInt();
			bean2.setSal(sal);

			System.out.println("Enter Gender");
			String gender = scn.next();
			bean2.setGender(gender);

			int count = dao2.insertEmployeeData(bean2);
			System.out.println(count+" Rows Inserted");
			break;

		case 3 :

			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean3 = new EmployeeBean();


			System.out.println("Enter Name");
			String name3 = scn.next();
			bean3.setName(name3);

			System.out.println("Enter Id");
			int id3 = scn.nextInt();
			bean3.setId(id3);



			int count3  = dao3.updateEmployeeData(bean3);
			System.out.println(count3+" Rows Updated");
			break;

		case 4 :

			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean4 = new EmployeeBean();

			int id4 = scn.nextInt();
			bean4.setId(id4);

			int count4 = dao4.deleteEmployeeData(bean4);
			System.out.println(count4 +" Rows Deleted");
			break;

		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean !=null) {
				System.out.println("Id is : "+bean.getId());
				System.out.println("Name is : "+bean.getName());
				System.out.println("Sal is :"+bean.getSal());
				System.out.println("Gender is :" +bean.getGender());



			}else {
				System.out.println("No data found");
			}
			break;

		}// end of switch	


	}// end of main
}// end of class
