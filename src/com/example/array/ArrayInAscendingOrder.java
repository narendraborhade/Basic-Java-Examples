package com.example.array;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {

		int a[] = {23,45,9,32,12,56,39,65,7};
		
		int temp;

		System.out.println("Array in asceding order:");
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+",");
		}
		
	}

}
