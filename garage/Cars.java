package com.qa.garage;

public class Cars extends Vehicle {

	private int doorCount;

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cars(int Id, String colour, int wheelCount, boolean petrolEngine, int doorCount) {
		super(Id, colour, wheelCount, petrolEngine);
		this.doorCount = doorCount;

	}

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

}
