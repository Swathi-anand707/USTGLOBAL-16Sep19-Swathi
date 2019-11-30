package com.ustglobal.assignment2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ustglobal.assignment2.dto.Student;

public class DeleteQue {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Student studentDetails = entityManager.find(Student.class, 10);	 
			entityManager.remove(studentDetails);
			System.out.println("one rows effected");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();



	}

}


