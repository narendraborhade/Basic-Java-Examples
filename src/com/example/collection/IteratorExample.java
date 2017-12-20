package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList<String> cityList = new ArrayList<String>();
		
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("Nashik");
		cityList.add("Kolhapur");
		
		Iterator<String> itList = cityList.iterator();
		
		System.out.println("Cities are as follows:");

		while(itList.hasNext()){
			String city = itList.next();
			System.out.println(city);
		}
		
		System.out.println("Updated Cities are as follows:");
		
		while(itList.hasNext()){
			String city = itList.next();
			itList.remove();
			System.out.println(city);
		}
		
	}

}
