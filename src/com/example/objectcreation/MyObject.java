package com.example.objectcreation;

public class MyObject implements Cloneable{

	public void getMessage(){
		
		System.out.println("Object created");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}
