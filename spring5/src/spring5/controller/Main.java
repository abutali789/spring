package spring5.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		UserDetails details1=(UserDetails) applicationContext.getBean("u1");
		details1.bMethod();
		
	}

}
