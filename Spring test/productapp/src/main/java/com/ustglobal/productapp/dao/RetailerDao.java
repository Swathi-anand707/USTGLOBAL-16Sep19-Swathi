package com.ustglobal.productapp.dao;


import com.ustglobal.productapp.beans.Retailer;

public interface RetailerDao {

	public Retailer login(int id, String password);
	public int register(Retailer bean);
	public boolean  changePassword(int id,String password);
	public boolean  upadteRetailer(Retailer bean);

}
