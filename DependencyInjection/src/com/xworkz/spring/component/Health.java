package com.xworkz.spring.component;

public class Health {

	private String bloodGroop;
	private double sugarLevel;

	public Health() {

		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public boolean beingActive() {
		System.out.println("invoked beingActive");
		System.out.println("blood group is\t" + this.bloodGroop);
		if (sugarLevel == 0)
			throw new IllegalArgumentException("sugarLevel should not be zero");
		if (sugarLevel > 118 && sugarLevel < 122) {
			System.out.println("Health is active");
			return Boolean.TRUE;
		}
		System.out.println("health is not active");
		return Boolean.FALSE;
	}

	public void setBloodGroop(String bloodGroop) {
		System.out.println("invoked setBloodGroop");
		this.bloodGroop = bloodGroop;
	}

	public void setSugarLevel(double sugarLevel) {
		System.out.println("invoked setSugarLevel");
		this.sugarLevel = sugarLevel;
	}
}
