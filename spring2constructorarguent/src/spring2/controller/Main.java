package spring2.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		
		
		  UserDetails u = (UserDetails) applicationContext.getBean("u1");
		  
		  System.out.println(u.getName());
		  
		  UserDetails u1= (UserDetails) applicationContext.getBean("u2");
		  
		 
	}

}
