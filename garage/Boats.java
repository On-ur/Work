package com.qa.garage;

public class Boats extends Vehicle {

	private int sailCount;

	public Boats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boats(int Id, String colour, int wheelCount, boolean petrolEngine, int sailCount) {
		super(Id, colour, wheelCount, petrolEngine);
		this.sailCount = sailCount;
		// TODO Auto-generated constructor stub
	}

	public int getSailCount() {
		return sailCount;
	}

	public void setSailCount(int sailCount) {
		this.sailCount = sailCount;
	}

}
