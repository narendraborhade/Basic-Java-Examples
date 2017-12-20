package com.example.string;

public class CharArrayToString {

	public static void main(String[] args) {

		char ch[] = {'a','b','c','d'};
		
		String str = String.copyValueOf(ch);
		
		System.out.println(str);
	}

}
