package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {

		Course c = new Course();
		c.setCid(1);
		c.setCname("Java");

		Course c1 = new Course();
		c1.setCid(2);
		c1.setCname("Testing");

		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c);
		al.add(c1);

		Student s = new Student();
		s.setSid(10);
		s.setSname("SWATHI");
		s.setCourse(al);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			System.out.println(s);

			System.out.println("record saved");

			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();

	}

}


