package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
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
			// fly jets here;
			break;
		case "3":
			// view the fastest jet
			break;
		case "4":
			// view the jet with the longest range
			break;
		case "5":
			// Load all cargo jets
			break;
		case "6":
			// Dogfight
			break;
		case "7":
			// add a jet to the fleet
			break;
		case "8":
			// remove a jet from the fleet

		}

	}
}
