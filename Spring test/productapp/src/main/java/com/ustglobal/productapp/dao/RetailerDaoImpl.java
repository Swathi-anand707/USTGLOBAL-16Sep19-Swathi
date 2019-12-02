package com.ustglobal.productapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.ustglobal.productapp.beans.Retailer;
@Repository
public class RetailerDaoImpl implements RetailerDao{
	@PersistenceUnit
	private EntityManagerFactory factory ;

	@Override
	public Retailer login(int id, String password) {
		String jpql ="from Retailer where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();


		TypedQuery<Retailer>  query = manager.createQuery(jpql, Retailer.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			Retailer bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		


		}
	}

	@Override
	public int register(Retailer bean) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			Retailer bean =manager.find(Retailer.class, id);

			bean.setPassword(password);

			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}


		return false;
	}

	@Override
	public boolean upadteRetailer(Retailer bean) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			Retailer retailbean=manager.find(Retailer.class, bean.getId());
			retailbean.setName(bean.getName());
			retailbean.setPassword(bean.getPassword());
			
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	


}
