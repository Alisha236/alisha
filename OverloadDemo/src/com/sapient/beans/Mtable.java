package com.sapient.beans;

public class Mtable {

	private int num;
	
	public void setNum(int num) throws Exception{
		if (num>0)
		  this.num = num;
		else
			throw new Exception ("number must be positive");
		
	}
	
	public void display(){
		for (int i=1;i<=10;++i)
			System.out.printf("%d * %d = %d\n",num,i,num*i	);
	}

	

}
