package com.example;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		int number;
		System.out.print("Enter Number:");
		Scanner input = new Scanner(System.in);
	
		number = input.nextInt();
		
		if(number == 1){
			System.out.println("number : " + number);
		}else if(number == 2){
			System.out.println("number : " + number);
		}else if(number == 3){
			System.out.println("number : " + number);
		}else if(number == 4){
			System.out.println("number : " + number);
		}else{
			System.out.println("Invalid number");
		}

	}

}
