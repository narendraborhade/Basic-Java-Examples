package com.example;

/**
 * @author Narendra Borhade
 *
 */
public class Hello {

	public static void main(String[] args) {
	
		System.out.println("Hello World");
		
		for(int i=1 ; i<=10; i++ ){
			for(int j=i ; j<=i; j++){
				
				System.out.println("Value of i : " + i);
				
				System.out.println("Value of j : " + j);
			}
		}
	}

}
