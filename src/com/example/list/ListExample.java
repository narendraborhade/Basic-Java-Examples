package com.example.list;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		final ArrayList<String> cityList = new ArrayList<String>();
		
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("Nashik");
		cityList.add("Kolhapur");
		
		System.out.println("Cities are as follows:");
		for(String city : cityList){
			System.out.println(city);
		}
	}

}
