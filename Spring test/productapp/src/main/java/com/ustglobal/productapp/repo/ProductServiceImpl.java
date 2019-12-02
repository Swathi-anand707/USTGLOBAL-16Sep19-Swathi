package com.ustglobal.productapp.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao dao1; 

	@Override
	public Product searchProduct(int pid) {
		return dao1.searchProduct(pid);
		
	}

}
