package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private ArrayList<Jet> jetList = new ArrayList<>();

	public ArrayList<Jet> getJetList() {
		return jetList;
	}

	public void setJetList(ArrayList<Jet> jetList) {
		this.jetList = jetList;
	}

	public void readFile() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jet.txt"))) {
			// make a new jet one by one, get the data on that line ie. name, model, speed,
			// etc, then split the line and assign
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields;
				fields = line.split(", ");

				if (fields[0] != null && fields[0].equals("CargoPlane")) {
					Jet cargoCreator = new CargoPlane(fields[1], Double.parseDouble(fields[2]),
							Integer.parseInt(fields[3]), Long.parseLong(fields[4]));
					jetList.add(cargoCreator);
				} else if (fields[0] != null && fields[0].equals("FighterJet")) {
					Jet fighterCreator = new FighterJet(fields[1], Double.parseDouble(fields[2]),
							Integer.parseInt(fields[3]), Long.parseLong(fields[4]));
					jetList.add(fighterCreator);
				} else if (fields[0] != null && fields[0].equals("Jet")) {
					Jet jetCreator = new JetImpl(fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
							Long.parseLong(fields[4]));
					jetList.add(jetCreator);

				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
