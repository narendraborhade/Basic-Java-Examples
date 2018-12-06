/**
 * @author Narendra Borhade
 *
 */
package com.example.string;

public class StringImmunability {

	public static void main(String[] args) {

		String word = "Hello";
		
		System.out.println("String is: " +word);
		
		word.concat("I am Narendra");
		
		System.out.println("Now String is: " +word);
		
		String word2 = word.concat(" I am Narendra");
		
		System.out.println("String after concatenation: " + word2);
	}

}
