package com.example;

public class TryWithoutCatch {

	private TryWithoutCatch(){
		
	}
	
	public static void main(String[] args) throws ArithmeticException{
		
		int a=10;
		int b=0;
		
		try{
			int c = a/b;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Try without catch");
		}
		
		

	}

}
