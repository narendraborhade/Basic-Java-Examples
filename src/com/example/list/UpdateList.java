package com.example.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UpdateList {

	public static void main(String[] args) {
		
		ArrayList<String> cityList = new ArrayList<String>();
		
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("Nashik");
		cityList.add("Kolhapur");
		cityList.add("Pune");
		
		System.out.println("Cities are as follows:");
		for(String city : cityList){
			System.out.println(city);
		}
		
		Set<String> citySet = new HashSet<String>(cityList);
		
		ArrayList<String> cityList2 = new ArrayList<String>();
		
		for(String city : citySet){
			cityList2.add(city);
		}
		
		System.out.println("Cities are as follows:");
		for(String city : cityList2){
			System.out.println(city);
		}
	}
}
