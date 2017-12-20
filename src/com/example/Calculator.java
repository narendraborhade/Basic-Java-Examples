package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a,b,result;
		System.out.print("Enter Value for a and b: ");
		Scanner input = new Scanner(System.in);
	
		a = input.nextInt();
		b = input.nextInt();

		result = sub(a,b);
		System.out.println("Addition : " + result);
				
		
	}

	private static int add(int a, int b) {
		return a+b;
	}
	
	private static int sub(int a, int b) {
		return a-b;
	}

}
