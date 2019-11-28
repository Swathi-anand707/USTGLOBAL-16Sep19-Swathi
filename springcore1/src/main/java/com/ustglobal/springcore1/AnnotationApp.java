package com.ustglobal.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore1.config.PetConfigurationClass;
import com.ustglobal.springcore1.di.Animal;
import com.ustglobal.springcore1.di.Hello;
import com.ustglobal.springcore1.di.Pet;
public class AnnotationApp {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(ConfigurationClass.class);
		 */
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(PetConfigurationClass.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		Hello hello1 = context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello1);
		/* which behaves like a singletone object */
		System.out.println("*********************************");
		/*
		 * Animal animal = context.getBean(Animal.class); animal.makeSound();
		 */
		System.out.println("************************************");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		context.close();
	}

}
