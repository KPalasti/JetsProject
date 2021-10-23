package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JetsApplication japp = new JetsApplication();
		AirField af = new AirField();

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
				for (Jet obj : af.getJetList()) {
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
				for (int i = 0; i < af.getJetList().size(); i++) {
					if (af.getJetList().get(index) != null) {
						if (af.getJetList().get(index).getSpeed() > topSpeed) {

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
				for (int i = 0; i < af.getJetList().size(); i++) {
					if (af.getJetList().get(indexer) != null) {
						if (af.getJetList().get(indexer).getRange() > longestRange) {

							longestRange = af.getJetList().get(indexer).getRange();
							indexer = i + 1;
						}
					}
				}
				System.out.println(longestRange);
				break;
			case "5":
				for (Jet load : af.getJetList()) {
					if (load instanceof CargoPlane) {
						((CargoPlane) load).loadCargo();
					}
				}
				break;
			case "6":
				for (Jet fighting : af.getJetList()) {
					if (fighting instanceof FighterJet) {
						((FighterJet) fighting).fight();
					}
				}
				break;
				
			case "7":
				System.out.println("What kind of plane would you like to create?");
				System.out.println("1. CargoPlane");
				System.out.println("2. FighterJet");
				System.out.println("3. New Jet Implement");
				String selector = scanner.nextLine();
				String implementor[] = {null,null,null,null, null};
				
				switch (selector) {
				case "1":
					Jet cargoCreator = new CargoPlane(implementor[1], Double.parseDouble(implementor[2]),
							Integer.parseInt(implementor[3]), Long.parseLong(implementor[4]));
					af.getJetList().add(cargoCreator);
				case "2":
					Jet fighterCreator = new CargoPlane(implementor[1], Double.parseDouble(implementor[2]),
							Integer.parseInt(implementor[3]), Long.parseLong(implementor[4]));
					af.getJetList().add(fighterCreator);
				case "3":
					Jet jetCreator = new CargoPlane(implementor[1], Double.parseDouble(implementor[2]),
							Integer.parseInt(implementor[3]), Long.parseLong(implementor[4]));
					af.getJetList().add(jetCreator);
				default:
					System.out.println("Invalid input.");
					break;

				}
				break;
				
			case "8":
				for (Jet obj : af.getJetList()) {
					System.out.println(obj);
				}

				System.out.println("Which jet would you like to remove? (1-5");

				String selection = scanner.nextLine();

				switch (selection) {

				case "1":

				case "2":

					break;
				case "3":

					break;
				case "4":

					break;
				case "5":

					break;

				}
				break;
				
				default: 
					System.out.println("Invalid input.");
					break;
			}

		}
	}
}
