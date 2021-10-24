package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void loadCargo() {
		System.out.println("Cargo loaded!");
	}
	@Override
	public String toString() {
		return "CargoPlane [getSpeedInMph()=" + getSpeedInMph() + ", getModel()=" + getModel() + ", getSpeed()="
				+ getSpeed() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}
	
}
