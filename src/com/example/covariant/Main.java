package com.example.covariant;

public class Main {

	public static void main(String args[]){
		
	/*	Child c = (Child) new Parent();
		
		c.getMessage();*/
		
		Parent p = new Child();
		p.getMessage();
		
		System.out.println(p);
	}
}
