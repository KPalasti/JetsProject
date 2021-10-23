package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JetsApplication japp = new JetsApplication();
		AirField af = new AirField();
		// iterating through the list call each jets methods

		japp.mainMenu(scanner, af);

	}

	public void mainMenu(Scanner scanner, AirField af) {
		boolean keepGoing = true;
		
		while (keepGoing) {
		System.out.println("1. List yer fleet!");
		System.out.println("2. Fly all jets!");
		System.out.println("3. View the fastest jet.");
		System.out.println("4. View the jet with the longest range.");
		System.out.println("5. Load all Cargo Jets.");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to the fleet.");
		System.out.println("8. Remove a jet from the Fleet");

		String input = scanner.nextLine();

		switch (input) {
		case "1":
			for (Jet obj: af.getJetList()) {
				System.out.println(obj);
			}
			break;
		case "2":
			for (Jet mph : af.getJetList()) {
				mph.fly();
			}
			break;
		case "3":
			double topSpeed = 0.0;
			int index = 0;
			for (int i =0; i < af.getJetList().size(); i++) {
				if(af.getJetList().get(index) != null) {
					if(af.getJetList().get(index).getSpeed() > topSpeed) {
						
						topSpeed = af.getJetList().get(index).getSpeedInMph();
						index = i + 1;
					}
				}
			}
			System.out.println(topSpeed);
			break;
		case "4":
			int longestRange = 0;
			int indexer = 0;
			for (int i = 0; i < af.getJetList().size();i++) {
				if(af.getJetList().get(indexer) != null){
					if(af.getJetList().get(indexer).getRange() > longestRange) {
						
						longestRange = af.getJetList().get(indexer).getRange();
						indexer = i + 1;
					}
				}
			}
			System.out.println(longestRange);
			
			break;
		case "5":
			for (Jet load : af.getJetList()) {
				CargoPlane cp = new CargoPlane();
				load.cp.loadCargo();
			}
			// Load all cargo jets
			break;
		case "6":
			// Dogfight
			break;
		case "7":
			System.out.println("Please enter your jet name, model, speed, range, and price: ");
			scanner = 
					//jetlist read file?
			for (Jet adder : af.getJetList()) {
				
			}
			// add a jet to the fleet
			break;
		case "8":
			// remove a jet from the fleet

		}

	}
	}
}
