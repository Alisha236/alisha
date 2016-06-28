package com.sapient.client;

import com.sapient.beans.Camera;
import com.sapient.beans.Computer;
import com.sapient.beans.Product;


public class ProductClient {

	public static void main(String[] args) {
		
		Product[] arr = new Product [4];
		arr[0] = new Computer(1001, "acer laptop", 50000, "intel pentium 5");
		arr[1] = new Computer(1002, "dell laptop", 30000, "intel i7");
		arr[2] = new Computer(1003, "nikon camera", 6000, "14MPX");
		arr[3] = new Computer(1004, "canon camera", 16000, "18MPX");
		
		for(Product p :arr){
			System.out.println(p.display() + " " + p.isExpensive());
		}
		
	}

}
