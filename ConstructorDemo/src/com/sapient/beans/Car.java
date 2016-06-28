package com.sapient.beans;

public class Car {
	
	private int carId;
	private String carName;
	private double price;
	
	public Car(int carId){
		super();
		this.carId = carId;
		System.out.println("one arg con called");
		
	}

	public Car(int carId, String carName) {
		
		this(carId);
		this.carName = carName;
		System.out.println("two arg con called");
	}
	
	public Car(int carId, String carName, double price){
	
		this(carId,carName);
		this.price = price;
		System.out.println("three arg con called");
	}

	public void display(){
		System.out.println(carId+"  " +carName + " " + price);
		
	}
	
	
	

	
	

}
