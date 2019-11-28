package com.ustglobal.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore1.di.Hello;

public class LifeCycleClass {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		Hello hello =context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		context.close();
	}

}
