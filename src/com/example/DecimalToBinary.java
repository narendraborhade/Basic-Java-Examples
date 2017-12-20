package com.example;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		int n;
		String binary = "";
		
		System.out.print("Enter Number:");
		Scanner in = new Scanner(System.in);
		
		n=in.nextInt();
		
		if (n == 0) {
	           System.out.println("Binary is:" + n);
	       }else{
	    	   while (n > 0) {
		           int rem = n % 2;
		           binary = rem + binary;
		           n = n / 2;
		       }
			System.out.println("Binary is:" + binary);   
	       }
	}

}
