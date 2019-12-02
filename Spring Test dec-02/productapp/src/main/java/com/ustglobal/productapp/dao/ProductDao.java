package com.ustglobal.productapp.dao;

import java.util.List;

import com.ustglobal.productapp.beans.OrderProduct;
import com.ustglobal.productapp.beans.Retailer;
import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;

public interface ProductDao {
	public Retailer login(String email,String password);
	public boolean register(Retailer user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(OrderProduct orderProduct);
}
