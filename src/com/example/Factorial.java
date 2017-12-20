package com.example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int a;
		
		System.out.println("Enter a Number:");
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		int f = 1;
		
		if(a<0){
			System.out.println("Number should not be less than 1");
		}else{
			for(int i=1; i<=a; i++){
				 f = f*i;
			}
			System.out.println("Factorial is :" +f);
		}
		
		
	}

}
