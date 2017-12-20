package com.example;

public class SwapNumbers {

	public static void main(String args[]){
		
		int a = 10;
		int b = 20;
		int c = 0 ;
		
		System.out.println("Before Swap a and b is :" +a +","+ +b);
		
		/*c=a;
		a=b;
		b=c;*/
		
		//without using third variable
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap a and b is :" +a +","+ +b);
		
	}
	
	
}
