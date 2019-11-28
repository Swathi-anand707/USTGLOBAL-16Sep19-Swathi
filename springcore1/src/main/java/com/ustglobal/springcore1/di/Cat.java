package com.ustglobal.springcore1.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{

	public void makeSound() {
		System.out.println("meeooooooo");
	}
}
