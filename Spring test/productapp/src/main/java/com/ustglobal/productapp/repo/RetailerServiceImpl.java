package com.ustglobal.productapp.repo;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.ustglobal.productapp.beans.Product;
import com.ustglobal.productapp.beans.Retailer;
import com.ustglobal.productapp.dao.ProductDao;
import com.ustglobal.productapp.dao.RetailerDao;


	
	@Service
	public abstract class RetailerServiceImpl implements RetailerService{
		@Autowired
		private RetailerDao dao; 
		private ProductDao dao1;

		@Override
		public Retailer login(int id, String password) {

			return dao.login(id, password);
		}

		@Override
		public int register(Retailer bean) {

			return dao.register(bean);
		}

		@Override
		public boolean changePassword(int id, String password) {

			return dao.changePassword(id, password);
		}

		@Override
		public boolean upadteRetailer(Retailer bean) {
			
			return dao.upadteRetailer(bean);
		}
		
		public Product searchProduct(int pid){
			return dao1.searchProduct(pid);
			
		}

	}
	



