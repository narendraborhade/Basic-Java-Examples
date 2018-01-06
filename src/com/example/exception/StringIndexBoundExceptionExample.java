/**
 * @author Narendra Borhade
 *
 */
package com.example.exception;

public class StringIndexBoundExceptionExample {

	public static void main(String[] args) {

		String str = "abcde";
		
		char c = str.charAt(6);
		
		System.out.println(c);
	}

}
