package com.ustglobal.productapp.repo;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.ustglobal.productapp.beans.OrderProduct;
import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;

public interface ProductService {
	public Retailer login(String email,String password);
	public boolean register(Retailer user);
	public Product search(String pname);
	public boolean updatePassword(String email,String password);
	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(Retailer user,Product product,int quantity);
}
