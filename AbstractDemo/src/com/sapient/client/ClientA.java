package com.sapient.client;

import com.sapient.beans.Vehicle;
import com.sapient.beans.Car;

public class ClientA {

	public static void main(String[] args) {
		Vehicle veh = new Car (1001, "tata sumo");
		System.out.println(veh.display());
		veh.drive();
	}

}
