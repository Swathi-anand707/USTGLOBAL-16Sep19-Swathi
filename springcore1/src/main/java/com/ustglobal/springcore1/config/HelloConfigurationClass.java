package com.ustglobal.springcore1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore1.di.Hello;
@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	@Bean(name="hello")
	/* @Scope("prototype") */
	/* which behaves like bean elements in the bean.xml */
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("i love python");

		return hello;
	}


}
