package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	private int count = 0;

	public void addVehicle(Vehicle v) {
		v.setId(++count);
		this.vehicles.add(v);
	}

	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);
	}

	public void empty() {
		this.vehicles.clear();
	}

	public void removeVehicle(int Id) {
		for (Vehicle v : this.vehicles)
			if (v.getId() == Id) {
				this.vehicles.remove(v);
			}
	}

	public void print() {
		System.out.println(this.vehicles);
	}

	public void removeVehicle(String string) {

	}

}
