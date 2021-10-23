package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void loadCargo() {
		System.out.println("Cargo loaded!");
	}
	
}
