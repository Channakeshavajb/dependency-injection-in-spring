package com.xworkz.spring.component;

public class Transport {

	private String name;
	private String type;
	private Driver driver;

	public Transport(String name, Driver driver) {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
		this.name = name;
		this.driver = driver;
	}

	public void transporting() {
		System.out.println("invoked transporting");
		driver.drive();
	}

	public void setType(String type) {
		System.out.println("invoked setType");
		this.type = type;
	}

}
