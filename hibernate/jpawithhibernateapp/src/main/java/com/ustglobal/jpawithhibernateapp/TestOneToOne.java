package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		VoterCard v = new VoterCard();
		v.setVid(10);
		v.setVname("Anand");
		Person p = new Person();
		p.setPid(1);
		p.setPname("Anand");
		p.setVoterCard(v);
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard  =entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPid());
			//entityManager.persist(p);
			System.out.println("record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
	}

}
