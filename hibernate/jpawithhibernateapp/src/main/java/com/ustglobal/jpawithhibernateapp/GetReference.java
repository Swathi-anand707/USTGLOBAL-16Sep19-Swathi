package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;	
		try {	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			Product productDetails = entityManager.getReference(Product.class, 101);	 

			System.out.println(productDetails.getPid());
			System.out.println(productDetails.getPname());
			System.out.println(productDetails.getQuantity());
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();	
	}
}
