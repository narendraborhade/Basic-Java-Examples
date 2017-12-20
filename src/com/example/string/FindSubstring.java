package com.example.string;

public class FindSubstring {

	public static void main(String[] args) {

		String str = "india";
		
		String str1= null;
		
		for(int i=0; i<str.length(); i++){
			
			for(int j=1; j<=str.length()-1; j++){
				
				str1 = str.substring(i, i+j);
				System.out.println("Sub Strings are: " +str1);
			}
		}
	}

}
