package com.ustglobal.productapp.repo;


import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;

	

	public interface RetailerService {
		public Retailer login(int id, String password);
		public int register(Retailer bean);
		public boolean  changePassword(int id,String password);
		public boolean  upadteRetailer(Retailer bean);
		public Product searchProduct(int pid);
		
		
		


	}



