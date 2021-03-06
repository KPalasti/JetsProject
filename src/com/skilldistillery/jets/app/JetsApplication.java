package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JetsApplication japp = new JetsApplication();
		AirField af = new AirField();

		japp.makeAirfield(af);
		ArrayList<Jet> jetList = af.getJetList();
		japp.mainMenu(scanner, af, jetList);

	}

	public void makeAirfield(AirField af) {
		af.fillHangar();
	}

	public void mainMenu(Scanner scanner, AirField af, ArrayList<Jet> jetList) {
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
			System.out.println("9. Quit");

			int input = scanner.nextInt();
			scanner.nextLine();
//			if(input.equals("quit")) {
//				keepGoing = false;
//			}
			switch (input) {

			case 1:
				for (Jet obj : jetList) {
					System.out.println(obj);
				}
				System.out.println();
				break;
			case 2:
				af.flyAllJets();
				System.out.println();
				break;
			case 3:
				double topSpeed = 0.0;
				int atIndex = 0;

				if (jetList.size() != 0) {
					for (int i = 0; i < jetList.size(); i++) {
						if (jetList.get(i).getSpeed() > topSpeed) {

							atIndex = i;
							topSpeed = jetList.get(i).getSpeedInMph();
						}
					}
				} else {
					System.out.println("No planes in hangar.");
				}

				System.out.println("Fastest in the fleet: " + jetList.get(atIndex) + " " + topSpeed);
				System.out.println();
				break;
			case 4:
				int longestRange = 0;
				int indexer = 0;
				if (jetList.size() != 0) {
					for (int i = 0; i < jetList.size(); i++) {
						if (jetList.get(i).getRange() > longestRange) {

							longestRange = jetList.get(indexer).getRange();
							indexer = i;
						}
					}
				}
				System.out.println("Jet with longest range: " + jetList.get(indexer) + " " + longestRange);
				System.out.println();
				break;
			case 5:
				for (Jet load : jetList) {
					if (load instanceof CargoPlane) {
						((CargoPlane) load).loadCargo();
					}
				}
				System.out.println("Cargo has been loaded for each individual CargoPlane on the manifest!");
				break;
			case 6:
				for (Jet fighting : jetList) {
					if (fighting instanceof FighterJet) {
						((FighterJet) fighting).fight();
					}
				}
				System.out.println();
				break;

			case 7:
				String model = "";
				double speed = 0.0;
				int range = 0;
				long price = 0;

				System.out.println("Welcome to the new plane creator.");
				System.out.println("To begin start with the model name of your jet.");
				model = scanner.nextLine();
				System.out.println("Input its max speed in integers.");
				speed = scanner.nextDouble();
				System.out.println("Input its max range in integers.");
				range = scanner.nextInt();
				System.out.println("Input its price in integers.");
				price = scanner.nextLong();

				System.out.println("Select what kind of jet grouping it belongs to.");
				System.out.println("1. CargoPlane");
				System.out.println("2. FighterJet");
				System.out.println("3. New Jet Implementation");
				
				int selector = scanner.nextInt();
				scanner.nextLine();

				switch (selector) {
				case 1:
					Jet cargoCreator = new CargoPlane(model, speed, range, price);
					jetList.add(cargoCreator);
					break;

				case 2:
					Jet fighterCreator = new FighterJet(model, speed, range, price);
					jetList.add(fighterCreator);
					break;
					
				case 3:
					Jet jetImplementor = new JetImpl(model, speed, range, price);
					jetList.add(jetImplementor);
					break;

				default:
					System.out.println("Invalid input.");
					break;

				}
				for (Jet obj : jetList) {
					System.out.println(obj);
				}
				System.out.println();
				break;

			case 8:
				for (Jet obj : jetList) {
					System.out.println(obj);
				}

				System.out.println("Which jet would you like to remove? (1-5)");

				int selection = scanner.nextInt();
				scanner.nextLine();

				switch (selection) {

				case 1:
					jetList.remove(0);
					break;
				case 2:
					jetList.remove(1);
					break;
				case 3:
					jetList.remove(2);
					break;
				case 4:
					jetList.remove(3);
					break;
				case 5:
					jetList.remove(4);
					break;

				}
				break;
			case 9:
				keepGoing = false;
				break;

			default:
				System.out.println("Invalid input.");
				System.out.println();
				mainMenu(scanner, af, jetList);
				break;
			}
		}

	}

	private Jet[] jetList() {
		return null;
	}
}
