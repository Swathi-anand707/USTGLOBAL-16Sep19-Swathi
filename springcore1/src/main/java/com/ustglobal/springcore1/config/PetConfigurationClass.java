package com.ustglobal.springcore1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore1.di.Cat;
import com.ustglobal.springcore1.di.Dog;
import com.ustglobal.springcore1.di.Hello;
import com.ustglobal.springcore1.di.Pet;
@Configuration
public class PetConfigurationClass {

	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
	}


	@Bean(name="pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("cizer");
		pet.setAnimal(getDog());
		/*
		 *  which never create second object instead of that it calls that object and
		 * print
		 */		return pet;
	}

}
