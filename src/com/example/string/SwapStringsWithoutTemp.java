package com.example.string;

public class SwapStringsWithoutTemp {

	public static void main(String[] args) {

		String str1 = "Jon";
		String str2 = "Snow";

		System.out.println("Strings before swap:");
		System.out.println("Str1:" +str1 +" | " +"Str2:" +str2);
		
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("Strings after swap:");
		System.out.println("Str1:" +str1 +" | " + "Str2:" +str2);
	}
}
