package com.example;

import java.util.Scanner;

/**
 * @author Narendra Borhade
 *
 */
public class forLoop {

	public static void main(String[] args) {
		
		
		int number;
		System.out.print("Enter Number:");
		Scanner input = new Scanner(System.in);
	
		number = input.nextInt();
		
		switch(number){
		
		case 1 : System.out.println("Hello");
				 break;
		
		case 2 : System.out.println("Namaste");
				 break;
		
		case 3 : System.out.println("Good Morning");
				 break;
		
		case 4 : System.out.println("Good Afternoon");
				 break;
		
		case 5 : System.out.println("Good Night");
				 break;
		
		}
	}

}
