package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetrieveDemo2 {
	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Product";
		Query query =entityManager.createQuery(jpql);
		List<Product> li= query.getResultList();
		for (Product object : li) {

			System.out.println(object.getPid());
			System.out.println(object.getPname());
			System.out.println(object.getQuantity());

		}

		entityManager.close();

	}

}
