package com.ustglobal.productapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ustglobal.productapp.beans.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	@PersistenceUnit
	private EntityManagerFactory factory ;
	@Override
	public Product searchProduct(int pid) {
		
			EntityManager manager =factory.createEntityManager();




			return manager.find(Product.class, pid);

		}

}

	

