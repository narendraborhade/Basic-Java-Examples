package com.example.string;

public class StringToCharArray {

	public static void main(String[] args) {

		String str = "Banana";
		
		char ch[]= str.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]);
		}
	}

}
