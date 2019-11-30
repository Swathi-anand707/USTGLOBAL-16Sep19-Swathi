package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;
import com.ustglobal.jpawithhibernateapp.manytoone.PencilBox;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestManyToOne {
	public static void main(String[] args) {
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("apsara");


		Pencil p = new Pencil();
		p.setPid(10);
		p.setColor("blue");
		p.setPencilBox(pb);


		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("red");
		p1.setPencilBox(pb);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			Pencil pbox  =entityManager.find(Pencil.class, 10);
			System.out.println(pbox.getPencilBox().getBid());
			//entityManager.persist(p);
			//entityManager.persist(p1);
			System.out.println("record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();


	}

}
