package com.xworkz.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.Driver;
import com.xworkz.spring.component.Health;
import com.xworkz.spring.component.Transport;

public class ThroughXml {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resource/context.xml");

		System.out.println(container.getBeanDefinitionCount());
		Health health = container.getBean(Health.class);
		Driver driver = container.getBean(Driver.class);
		Transport transportGoods = container.getBean("transportGoods",Transport.class);
		transportGoods.transporting();
		
		Transport transportPass = container.getBean("transportPassenger",Transport.class);
		transportPass.transporting();
	}
}
