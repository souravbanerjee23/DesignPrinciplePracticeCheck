package com.cognizant.abstractFactory;

public abstract class Car {

	CarType model = null;
	Location location = null;

	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

	abstract void construct();

	CarType getModel() {
		return model;
	}

	void setModel(CarType model) {
		this.model = model;
	}

	Location getLocation() {
		return location;
	}

	void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}

}