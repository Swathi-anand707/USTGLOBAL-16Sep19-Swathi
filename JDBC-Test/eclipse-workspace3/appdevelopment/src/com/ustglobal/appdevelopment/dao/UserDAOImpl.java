package com.ustglobal.appdevelopment.dao;

import java.util.Scanner;

public class UserDAOImpl{
	public static void main(String[] args) {
		for(;;) {
			System.out.println("press 1 to show all the contacts");
			System.out.println("press 2 to search for contacts");
			System.out.println("press 3 to opearte on contcts");
			try{
				Scanner sc=new Scanner(System.in);
				int ch=sc.nextInt();
				
				UserDAOImpl dao=new UserDAOImpl();
				switch (ch) {
				case 1:
					dao.showAll();
					break;
				case 2:
					System.out.println("Enter name to search");
					String name=sc.next();
					dao.search(name);
					break;
				case 3:
					dao.operateOnCon();
				default:
					break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	}


	
	

