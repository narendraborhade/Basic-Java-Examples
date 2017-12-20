package com.example.interview;

public class BubbleSort {

	public static void main(String[] args) {

		int array[] = {13, 45, 9, 12, 0, 30, 3, 5, 50};
		
		buubleSort(array);
		
	}

	public static void printArray(int a[]){
	
		for(int i=0; i<a.length; i++){
			System.out.println("Array Elements are :" +a[i]);
		}
	}
	
	public static void buubleSort(int a[]){
		
		int n= a.length;
		int k;
		
		for(int m=n;  m>=0; m-- ){
			for(int i=0; i<n-1; i++){
				k = i+1;
				
				if(a[i] > a[k]){
				swap(i, k , a);	
				}
			}
		}
		printArray(a);
	}
	

	public static void swap(int i, int k, int a[]){
		
		int temp;
		
		temp = a[i];
		a[i] = a[k];
		a[k] = temp;
		
	}
}
