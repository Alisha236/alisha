package com.sapient.bean;

public class FindNumber {
	public int num;
	public long findFact(){
		long fact =1;
		for(int i=1; i<=num; ++i)
			fact = fact*i;
		return fact;
	}
	
	public String findArmstrong(){
		String res = "not armstrong";
		
		return res;
		
	}

}
