package com.sapient.client;

import com.sapient.beans.StdCalculator;

public class ClientA {

	public static void main(String[] args) {
		try{
		StdCalculator calc = new StdCalculator(56.37867);
		System.out.println(calc.round2dec());
		System.out.println(calc.round2dec(3));
		System.out.println(calc.convert2Int());
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// invoking constructor with int arg
		try{
			StdCalculator calc = new StdCalculator(200);
			System.out.println(calc.convertToBin());
			System.out.println(calc.convertToOctal());
			System.out.println(calc.convertToHexa());
			}catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		// invoking constructor with two arg
		try{
			StdCalculator calc = new StdCalculator(20.7889,50.3875);
			System.out.println(calc.doAdd());
			System.out.println(calc.doSub());
			System.out.println(calc.doMultiply());
			System.out.println(calc.round2dec());
			System.out.println(calc.round2dec(3));
			System.out.println(calc.convertToBin());
			
			}catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		
	}
	

}
