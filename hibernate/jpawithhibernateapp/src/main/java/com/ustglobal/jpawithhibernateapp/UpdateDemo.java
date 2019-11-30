package com.ustglobal.jpawithhibernateapp;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product productDetails = entityManager.find(Product.class, 101);	 
			productDetails.setPname("laptop");
			System.out.println("one rows effected");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();



	}

}
