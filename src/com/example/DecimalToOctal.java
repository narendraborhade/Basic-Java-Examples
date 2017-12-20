package com.example;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {

		int n;
		String octal = "";
		
		System.out.print("Enter Number:");
		Scanner in = new Scanner(System.in);
		
		n=in.nextInt();
		
		if (n == 0) {
	           System.out.println("Octal is:" + n);
	       }else{
	    	   while (n > 0) {
		           int rem = n % 8;
		           octal = rem + octal;
		           n = n / 8;
		       }
			System.out.println("Octal is:" + octal);   
	       }
	}

}
