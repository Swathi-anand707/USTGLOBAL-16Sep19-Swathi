package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class Reattaching {
	public static void main(String[] args) {
		EntityManager entityManager =null;
		EntityTransaction entityTransaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 10);
			System.out.println(entityManager.contains(product));// which checks object present or not
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			Product productInfo = entityManager.merge(product);
			productInfo.setPname("laptop");
			System.out.println(" one Row(s) effected");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
