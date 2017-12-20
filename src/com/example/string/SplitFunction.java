package com.example.string;

public class SplitFunction {

	public static void main(String[] args) {

		String str = "This is India";
		
		String[] tokens = str.split(" ") ;
		
		for(String str1 : tokens){
			System.out.println(str1);
		}
	}

}
