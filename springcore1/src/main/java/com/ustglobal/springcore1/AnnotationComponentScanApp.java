package com.ustglobal.springcore1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore1.config.ComponentScanConfiguration;
import com.ustglobal.springcore1.di.Hello;
import com.ustglobal.springcore1.di.Pet;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		Hello hello =context.getBean(Hello.class);
		hello.setMsg("I love Myself");
		System.out.println(hello.getMsg());

		Pet pet = context.getBean(Pet.class);
		pet.setName("rosy");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
