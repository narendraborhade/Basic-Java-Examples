package com.example.immutable;

import java.util.Date;

public class StudentMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Student s = new Student(1,"Narendra", new Date());
		
		System.out.println("Id:" +s.getSid());
		System.out.println("Name:" +s.getName());
		
		Date dob = s.getDob();
		dob.setYear(1989);
		dob.setMonth(05);
		dob.setDate(20);
		
		System.out.println("DOB:" +dob);
	}

}
