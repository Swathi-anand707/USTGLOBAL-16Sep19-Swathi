package com.ustglobal.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore1.di.Animal;
import com.ustglobal.springcore1.di.Hello;
import com.ustglobal.springcore1.di.Pet;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");  //created obj
		Hello hello = context.getBean(Hello.class);
		/*
		 * gtg the obj through context
		 */		
		System.out.println(hello.getMsg());
		System.out.println(hello.getMap());
		Hello hello2 = context.getBean(Hello.class);

		System.out.println(hello);
		System.out.println(hello2);

		Hello hello3 = context.getBean(Hello.class);    
		/*
		 *  by default spring always creates singelton obj (means same obj by its
		 * hexadecimal value)
		 */		
		System.out.println(hello3);

		/*
		 * if we want diff obj then add scope = "prototype" in bean.xml
		 */
		Animal animal1 = context.getBean(Animal.class);   
		/* no need to create again context obj */
		animal1.makeSound();

		Animal animal2 = (Animal)context.getBean("dog");
		animal2.makeSound();

		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
