package com.ustglobal.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore1.di.Hello;
import com.ustglobal.springcore1.di.Pet;

public class XmlComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Hello hello =context.getBean(Hello.class);
		hello.setMsg("I love java");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("cizuu");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}

}
