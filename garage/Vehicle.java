package com.qa.garage;

public abstract class Vehicle {

	public int Id;
	public int wheelCount;
	public boolean petrolEngine;
	public String colour;

	public Vehicle() {
		super();
	}

	public Vehicle(int Id, String colour, int wheelCount, boolean petrolEngine) {
		super();
		this.Id = Id;
		this.colour = colour;
		this.wheelCount = wheelCount;

	}

	public void setId(int Id) {
		// TODO Auto-generated method stub

	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
