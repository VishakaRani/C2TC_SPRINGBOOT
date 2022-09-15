package com.tns.springaw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext();	
	Human human=c.getBean("human",Human.class);
    human.startPumping();
	}
}
