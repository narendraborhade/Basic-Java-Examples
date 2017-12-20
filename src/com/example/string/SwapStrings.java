package com.example.string;

public class SwapStrings {

	public static void main(String[] args) {

		String str1 = "Jon";
		String str2 = "Snow";
		String temp = null;

		System.out.println("Strings before swap:");
		System.out.println("Str1:" +str1 +" | " +"Str2:" +str2);
		
		temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("Strings after swap:");
		System.out.println("Str1:" +str1 +" | " + "Str2:" +str2);
	}

}
