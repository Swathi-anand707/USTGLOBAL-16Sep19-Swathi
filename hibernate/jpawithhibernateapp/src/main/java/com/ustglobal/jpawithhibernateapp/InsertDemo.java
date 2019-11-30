package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product product = new Product();
		product.setPid(10);
		product.setPname("Mobile");
		product.setQuantity(50);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();
		
	}

}
