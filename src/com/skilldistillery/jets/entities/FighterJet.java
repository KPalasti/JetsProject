package com.skilldistillery.jets.entities;

public class FighterJet extends Jet{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	public void flight() {
		System.out.println("You fly gracefully through the air.");
	}

}
