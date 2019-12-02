package com.ustglobal.productapp.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
	private String pname;
	@Column
	private int price;
	@Exclude
	@OneToMany(mappedBy = "retailer")
	private List<Retailer> retailer;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
