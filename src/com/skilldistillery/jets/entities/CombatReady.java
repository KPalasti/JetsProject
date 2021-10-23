package com.skilldistillery.jets.entities;

public class CombatReady extends FighterJet{

	public CombatReady(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void fight() {
		System.out.println("A dogfight begins.");
	}
}
