package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence"); 
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "Update Product set pname=:name where pid = :id ";
			Query query =entityManager.createQuery(jpql);
			query.setParameter("name", "watch");
			query.setParameter("id", 10);

			int result =query.executeUpdate();
			System.out.println(result);
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}


}
