package spring3.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		UserDetails user=(UserDetails) applicationContext.getBean("u1");
		System.out.println(user.getName());
		
		UserDetails useDetails=(UserDetails) applicationContext.getBean("u2");

		
		//UserDetails details=(UserDetails) applicationContext.getBean("u2");
	}

}
