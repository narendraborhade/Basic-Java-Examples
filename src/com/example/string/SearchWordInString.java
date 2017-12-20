package com.example.string;

public class SearchWordInString {

	public static void main(String[] args) {

		String str = "This is India";
		
		int isIndex = str.indexOf("India");
		
		if(isIndex == -1){
			System.out.println("India not found");
		}else{
			System.out.println("India found in string at index:" + isIndex);
		}
	}

}
