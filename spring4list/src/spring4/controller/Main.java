package spring4.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserDetails userDetails = (UserDetails) applicationContext.getBean("u1");
		List l = userDetails.getDatabase();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");

		}
	}

}
