package com.example.string;

public class ContetEquals {

	public static void main(String[] args) {

		String first = "Hello, I am Narendra";
		
		StringBuffer second = new StringBuffer("Hello, I am Narendra");
		
		if(first.equals(second)){
			System.out.println("Content of first and second are equal");
		}else if(first.contentEquals(second)){
			System.out.println("Content of first and second are equal using contentEquals method");
		}
		
		String str1="Narendra";
		StringBuffer str2 = new StringBuffer("Narendra");
		
		if(str1.equals(str2)){
			System.out.println("str1 and str2 are equal");
		}
	}

}
