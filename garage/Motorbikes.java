package com.qa.garage;

public class Motorbikes extends Vehicle {

	private int engineSize;

	public Motorbikes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorbikes(int Id, String colour, int wheelCount, boolean petrolEngine, int engineSize) {
		super(Id, colour, wheelCount, petrolEngine);
		this.engineSize = engineSize;
		// TODO Auto-generated constructor stub
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

}
