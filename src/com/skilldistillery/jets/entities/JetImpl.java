package com.skilldistillery.jets.entities;

public class JetImpl extends Jet{

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "JetImpl [getSpeedInMph()=" + getSpeedInMph() + ", getModel()=" + getModel() + ", getSpeed()="
				+ getSpeed() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}
	
}
