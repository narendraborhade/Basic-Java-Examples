package com.example.string;

public class ReplaceCharacters {

	public static void main(String[] args) {

		String str = "This is India. India is beautiful country";
		
		System.out.println(str);
		
		String str1 = str.replace('i', 'y');
		
		System.out.println(str1);
		
		String str2 = str.replaceAll("is", "was");
		
		System.out.println(str2);
	}

}
