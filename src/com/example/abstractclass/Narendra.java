package com.example.abstractclass;

public class Narendra extends PersonalInfo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Narendra n = new Narendra();
		
		int age = n.age(25);
		String gender = n.gender("Male");
		
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
	}

}
