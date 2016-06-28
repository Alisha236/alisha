package com.sapient.client;

import com.sapient.bean.CircleService;



public class CirClient {

	public static void main(String[] args) {
		CircleService service = new CircleService();
		service.radius=5.2;
		double area = service.calcArea();
		double peri =service.calcPeri();
		System.out.println("area " +area);
		System.out.println("peri " +peri);
		
		
	}

}
