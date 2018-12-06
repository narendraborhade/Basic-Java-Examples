/**
 * @author Narendra Borhade
 *
 */
package com.example.array;

import java.util.Arrays;
import java.util.List;


public class ArrayExample {

	public static void main(String[] args) {

		int a[] = {2,23,15,56,12,45,37,50,43};
		
		System.out.println("Length of Array:" + arrayLength(a));
		
		printArray(a);

		System.out.println();
		
		System.out.println("New Length of Array:" + changeArrayLength(a,20));
		
		System.out.println("Array in Ascending order is :");
		
		Arrays.sort(a);
		
		printArray(a);
		
		System.out.println("Array In List:");
		
		convertArrayInList(a);
		
		printArray(a);
		
	}
	
	public static int arrayLength(int a[]){
		return a.length;
	}
	
	public static int changeArrayLength(int a[], int length){
		return Arrays.copyOf(a, length).length;
	}
	
	public static void printArray(int a[]){
		System.out.println("Elements in Array are:");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + ",");
		}
	}
	
	public static void sortArray(int a[]){
		Arrays.sort(a);
	}
	
	public static List<int[]> convertArrayInList(int a[]){
		return Arrays.asList(a);
		
	}
	

}
