package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public abstract class Jet {
	
	private String model;
	private double speed;
	private int range;
	private long price;
	AirField af = new AirField();
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		
		double time = range / speed;
		System.out.println("Flying-- "+time+" hours remain.");
	}
	
	public double getSpeedInMph() {
		return speed;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

}
