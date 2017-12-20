package com.example.string;

public class StartAndEnd {

	public static void main(String[] args) {

		String str = "Hello, it's me";
		
		if(str.startsWith("Hello")){
			System.out.println("str starts with 'Hello'");
		}else{
			System.out.println("str NOT starts with 'Hello'");
		}
		
		if(str.endsWith("mee")){
			System.out.println("str ends with 'me'");
		}else{
			System.out.println("str NOT ends with 'me'");
		}
		
	}

}
