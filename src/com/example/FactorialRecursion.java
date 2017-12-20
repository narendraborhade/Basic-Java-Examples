package com.example;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		int n,f;
		
		System.out.print("Enter a number:" );
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		
		f = factorial(n);
		
		System.out.println("Factorial of number is:" +f);

	}
	
	public static int factorial(int n){
		
		if(n==0){
			return 1;
		}else{
			return (n*factorial(n-1));
		}
		
	}

}
