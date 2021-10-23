package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	private AirField airField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AirField af = new AirField();
	JetsApplication japp = new JetsApplication();
	af.readFile(jetList);
	japp.mainMenu();

	}
	public void mainMenu() {
		System.out.println("1. List yer fleet!");
		System.out.println("2. Fly all jets!");
		System.out.println("3. View the fastest jet.");
		System.out.println("4. View the jet with the longest range.");
		System.out.println("5. Load all Cargo Jets.");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to the fleet.");
		System.out.println("8. Remove a et from the Fleet");
	}
}
