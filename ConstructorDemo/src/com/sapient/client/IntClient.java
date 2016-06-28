package com.sapient.client;


import java.util.Scanner;

import com.sapient.beans.Interest;

public class IntClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the amount");
		double amt = scan.nextDouble();
		System.out.println("enter the years");
		int years = scan.nextInt();
		System.out.println("enter the rate");
		float rate = scan.nextFloat();
		int opt=0;
		System.out.println("1--simple\n  2--compound\n");
		opt=scan.nextInt();
		Interest obj = null;
		try {
			obj= new Interest(amt,years,rate);
			switch (opt){
			case 1:
				System.out.println("simple " + obj.calcSimple());
				break;
			case 2:
				System.out.println("compound " + obj.calcCompound());
				break;
			default:
				System.out.println("invalid option ");
				
			}
			System.out.println("simple" +obj.calcSimple());
			System.out.println("compound" +obj.calcCompound());
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
