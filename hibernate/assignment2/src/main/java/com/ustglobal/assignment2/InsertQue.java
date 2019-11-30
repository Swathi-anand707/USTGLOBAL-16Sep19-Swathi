package com.ustglobal.assignment2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ustglobal.assignment2.dto.Student;
public class InsertQue {
	public static void main(String[] args) {
		Student student = new Student();
		student.setSid(10);
		student.setSname("Swathi");
		student.setPercentage(95);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();

	}

}


