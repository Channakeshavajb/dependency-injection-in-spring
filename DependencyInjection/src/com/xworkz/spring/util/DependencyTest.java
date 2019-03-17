package com.xworkz.spring.util;

import com.xworkz.spring.component.Driver;
import com.xworkz.spring.component.Health;
import com.xworkz.spring.component.Transport;

public class DependencyTest {

	public static void main(String[] args) {

		Health health = new Health();
		health.setBloodGroop("o+");
		health.setSugarLevel(120);

		Driver driver = new Driver("KA13  20091001067");
		driver.setExp(15);
		driver.setHealth(health);

		String transportName = new String("VRL");
		String transportTypeGoods = new String("Goods");
		String transportTypePassenger = new String("Passenger");

		Transport transport = new Transport(transportName, driver);
		transport.setType(transportTypeGoods);
		transport.transporting();

		Transport transport1 = new Transport(transportName, driver);
		transport1.setType(transportTypePassenger);
		transport1.transporting();

	}

}
