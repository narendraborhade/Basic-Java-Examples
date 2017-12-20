package com.example.java8;

public class LambdaExpressionExample {

	public static void main(String args[]){
		
		int w=10;
		
		Shape s = ()->{
			System.out.println("Shape width:" + w);
		};
		
		s.draw();
		s.getMesage();
	}		
}
