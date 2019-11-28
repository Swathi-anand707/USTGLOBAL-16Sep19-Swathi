package com.ustglobal.springcore1.di;

import java.util.Map;

import org.springframework.stereotype.Component;
@Component("hello")
public class Hello {
	private String msg;
	private Map<String,Integer> map;
	public Map<String,Integer> getMap(){
		return map;
	}
	public void setMap( Map<String,Integer> map) {
		this.map= map;
	}


	public String getMsg() {
		return msg;
	}
	public Hello() {
		System.out.println("hello object is created");
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void init() {
		System.out.println("Init  method executing from hello");
	}
	public void destroy() {
		System.out.println("destroy  method executing from hello");
	}


}
