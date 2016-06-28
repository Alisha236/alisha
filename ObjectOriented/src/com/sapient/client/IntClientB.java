package com.sapient.client;

import java.util.Scanner;

import com.sapient.bean.Interest;

public class IntClientB {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the amount");
		double amt = scan.nextDouble();
		System.out.println("enter the years");
		int years = scan.nextInt();
		System.out.println("enter the rate");
		float rate = scan.nextFloat();
		String opt = "";
		System.out.println("1--simple\n  2--compound\n");
		opt=scan.next();
		Interest obj = new Interest();
		obj.amt = amt;
		obj.rate=rate;
		obj.years=years;
		switch (opt){
		case "simple":
			System.out.println("simple " + obj.calcSimple());
			break;
		case "compound":
			System.out.println("compound " + obj.calcCompound());
			break;
		default:
			System.out.println("invalid option ");
			
		}
	}

}



