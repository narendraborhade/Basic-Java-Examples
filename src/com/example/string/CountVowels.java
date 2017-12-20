package com.example.string;

public class CountVowels {

	public static void main(String[] args) {

		String str = "appleiouasdfasdfa is 1 ";
		
		int countVowels = 0;
		
		for(int i=0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i'){
				countVowels++;
			}
		}
		System.out.println("Vowels in String are :" + countVowels);
	}

}
