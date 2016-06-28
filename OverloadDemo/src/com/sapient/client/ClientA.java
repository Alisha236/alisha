package com.sapient.client;

import com.sapient.beans.Mtable;

public class ClientA {

	public static void main(String[] args) {
		Mtable tb1 = new Mtable();
		
		try{
			tb1.setNum(5);
			tb1.display();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
