package com.example.junit;

public class Main {

	public static void main(String[] args) {

		long a = 10;
		long b = 10;
		long result;
		
		Calculate c = new CalculateImpl();
		
		result=c.add(a, b);
		System.out.println("Addition:" + result);
		
		result=c.sub(a, b);
		System.out.println("Substraction:" + result);
		
		result=c.mul(a, b);
		System.out.println("Multiplication:" + result);
		
		result=c.div(a, b);
		System.out.println("Division:" + result);
	}

}
