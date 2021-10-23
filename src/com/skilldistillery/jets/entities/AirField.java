package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	ArrayList<String> jetList = new ArrayList<>();

public void readFile(ArrayList<String> jet) {
	
	try (BufferedReader bufIn = new BufferedReader(new FileReader("jet.txt"))) {
		//make a new jet one by one, get the data on that line ie. name, model, speed, etc, then split the line and assign 
		String line;
		while ((line = bufIn.readLine()) != null) {
			String [] fields;
			fields = line.split(", ");
			
		}
		//make a jet inside the while loop
	} catch (IOException e) {
		System.err.println(e);
	}
}
}
