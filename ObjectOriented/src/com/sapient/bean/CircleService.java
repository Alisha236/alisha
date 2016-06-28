package com.sapient.bean;

public class CircleService {
	public double radius;
	
	public double calcArea(){
		return Math.PI * radius * radius;
		
	}
	public double calcPeri(){
		return 2* Math.PI *radius;
		
	}

}
