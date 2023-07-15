package com.jsp.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	Car c=(Car)applicationContext.getBean("mycar");
	c.write();
}
}
