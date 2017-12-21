/**
 * @author Narendra Borhade
 *
 */
package com.example.string;

public class StringMethods {

	public static void main(String[] args) {

		String str = " narendra ";
		
		//Calcuates the length of string
		int stringLength = str.length();
		System.out.println("Length of String is:" + stringLength);

		//Returns Characters in string
		for(int i=0; i<str.length(); i++){
			Character stringCharacter = str.charAt(i);
			System.out.println("String Charaters are: " + stringCharacter);
		}
		
		//Returns trimmed string
		String trimmedString = str.trim();
		System.out.println("Trimmed String:" +trimmedString);
		
	}
	
	

}
