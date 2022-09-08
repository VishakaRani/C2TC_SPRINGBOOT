package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {

	private static ApplicationContext c;

	public static void main(String[] args) {
		c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
		
		sim s= c.getBean("sim",sim.class);
		s.calling();
		s.data();
		
		
	}

}