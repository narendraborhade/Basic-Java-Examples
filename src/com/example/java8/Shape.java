package com.example.java8;

@FunctionalInterface
public interface Shape {
	void draw();
	//void paint();
	
	default void getMesage(){
	       System.out.println("Hello");
	      }
}
