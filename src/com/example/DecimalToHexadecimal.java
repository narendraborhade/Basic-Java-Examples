package com.example;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		int n;
		String hex = "";
		
		System.out.print("Enter Number:");
		Scanner in = new Scanner(System.in);
		
		n=in.nextInt();
		
		if (n == 0) {
	           System.out.println("Hexadecimal is:" + n);
	       }else{
	    	   while (n > 0) {
		           int rem = n % 16;
		           hex = rem + hex;
		           n = n / 16;
		       }
			System.out.println("Hexadecimal is:" + hex);   
	}
}

}
