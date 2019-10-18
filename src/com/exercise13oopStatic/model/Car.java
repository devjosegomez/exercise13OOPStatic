package com.exercise13oopStatic.model;

public class Car {
	private String serialNumber;
	private int numberDoors;
	
	public Car(){
		
	}
	
	public Car(String serialNumber, int numberDoors){
		this.serialNumber = serialNumber;
	}
	
	 
	//Getters and setters serialNumber
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber() {
		this.serialNumber = serialNumber;
	}
	
	//Getters and setters NumbersDoors
	public int getNumberDoors() {
		return numberDoors;
	}
	
	public void setNumberDoors() {
		this.numberDoors = numberDoors;
	}
	
	
	
}
