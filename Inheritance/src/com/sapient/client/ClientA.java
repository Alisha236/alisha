package com.sapient.client;

import com.sapient.beans.NokiaLuimia;

public class ClientA {

	public static void main(String[] args){
		NokiaLuimia obj = new NokiaLuimia();
		obj.doConverse();
		obj.sendSms();
		obj.browseNet();
		obj.captureVideo();

	}

}

