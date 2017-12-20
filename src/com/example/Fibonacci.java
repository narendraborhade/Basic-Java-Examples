package com.example;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n, n1=0, n2=1, n3;
		
		System.out.print("Enter Fibonacci Series up to:");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		if(n==0){
			System.out.println("Fibonacci Series :"+ n);
		}else{
			System.out.print("Fibonacci Series :");
			System.out.print(n1+",");
			System.out.print(n2+",");
			
			for(int i=2; i<n; i++){
				n3= n1+n2;
				System.out.print(n3+",");
				n1=n2;
				n2=n3;
			}
		}
	}

}
