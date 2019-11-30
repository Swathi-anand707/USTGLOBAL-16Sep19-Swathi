package com.ustglobal.assignment2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.assignment2.dto.Student;

public class ReadQue {	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student studentDetails = entityManager.find(Student.class, 10);

		System.out.println("Id is : "+studentDetails.getSid());
		System.out.println("Product name is : "+studentDetails.getSname());
		System.out.println("Quantity is : "+studentDetails.getPercentage());
		entityManager.close();
	}

}

