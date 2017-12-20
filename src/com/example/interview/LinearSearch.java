package com.example.interview;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = {11, 22, 33, 44, 55, 11, 66, 77,};
		
		int count = a.length;
		
		System.out.println(count);
		
		int n=66;
		
		for(int i=0; i<a.length; i++){
			
			if(a[i]==n){
				System.out.println("Number found in array");
				break;
			}
		}
	}

}
