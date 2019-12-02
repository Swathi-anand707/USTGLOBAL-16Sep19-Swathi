package com.ustglobal.productapp.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.productapp.beans.OrderProduct;
import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;
import com.ustglobal.productapp.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;
	@Override
	public Retailer login(String email, String password) {
		
		return dao.login(email, password);
	}

	@Override
	public boolean register(Retailer user) {
		return dao.register(user);
	}

	@Override
	public Product search(String pname) {
		return dao.search(pname);
	}

	@Override
	public boolean updatePassword(String email, String password) {
		return dao.updatePassword(email, password);
		
	}

	@Override
	public List<OrderProduct> getProducts(String email) {
		return dao.getProducts(email);
	}

	@Override
	public boolean buyProduct(Retailer user,Product product,int quantity) {
		OrderProduct orderProduct=new OrderProduct();
		orderProduct.setPrice(product.getPrice());
		orderProduct.setEmail(user.getEmail());
		int total=product.getPrice()*quantity;
		orderProduct.setTotal(total);
		orderProduct.setPname(product.getPname());
		orderProduct.setQuantity(quantity);	
		return dao.buyProduct(orderProduct);
	}
}
