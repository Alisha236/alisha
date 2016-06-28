package com.sapient.client;
import java.util.Scanner;
import com.sapient.bean.FindNumber;


public class FactClient {

	public static void main(String[] args) {
	FindNumber obj = new FindNumber();
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	obj.num = scan.nextInt();
	System.out.println("factorial " + obj.findFact());
	
	}

}
