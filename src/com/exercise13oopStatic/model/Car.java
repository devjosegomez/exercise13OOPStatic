package com.exercise13oopStatic.model;

public class Car {
	private String serialNumber;
	private int numberDoors;
	private boolean isCoupe = false;
	
	public Car(){
		
	}
	
	public Car(String serialNumber, int numberDoors){
		this.serialNumber = serialNumber;
		this.numberDoors = numberDoors;
	}
	
	 
	//Getters and setters serialNumber
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	//Getters and setters NumbersDoors
	public int getNumberDoors() {
		return numberDoors;
	}
	
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	
	
	public void CarIsCoupe(boolean isCoupe) {
		this.isCoupe = isCoupe;
		if(isCoupe) {
			this.numberDoors = 2;
		}else {
			this.numberDoors = 4;
		}
	}
	
}
