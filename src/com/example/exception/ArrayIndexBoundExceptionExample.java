/**
 * @author Narendra Borhade
 *
 */
package com.example.exception;

public class ArrayIndexBoundExceptionExample {

	public static void main(String[] args) {

		int a[] = new int[3];
		
		 a[0] = 1;
		 a[1] = 2;
		 a[2] = 3;
		 a[3] = 1;
		 
		 for(int i=0 ; i<a.length; i++){
			 System.out.println(a[i]);
		 }
	}
}
