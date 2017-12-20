package com.example;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		
		n=in.nextInt();
		
		int m = n/2;
		boolean flag = true;
		
		for(int i=2; i<=m; i++){
			
			if(n%i==0){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Number is Prime");
		}else{
			System.out.println("Number is not Prime");
		}

	}

}
