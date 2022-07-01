package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.addVehicle(new Cars(int Id, String colour, int wheelCount, boolean petrolEngine, int doorCount));
		garage.addVehicle(new Motorbikes(int ld, String colour, int wheelCount, boolean petrolEngine, int engineSize));
		garage.addVehicle(new Boats(int Id, String colour, int wheelCount, boolean PrayerEngine, int sailCount));
		
		garage.print();
		garage.removeVehicle(3);
		garage.print();
		garage.removeVehicle("Boats");
		garage.print();
	}

}
