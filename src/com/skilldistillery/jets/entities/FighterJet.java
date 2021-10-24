package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fight() {
		System.out.println("An intense dog-fight breaks out in the sky.");
		
	}

	@Override
	public String toString() {
		return "FighterJet [getSpeedInMph()=" + getSpeedInMph() + ", getModel()=" + getModel() + ", getSpeed()="
				+ getSpeed() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

}
