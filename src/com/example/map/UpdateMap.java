package com.example.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class UpdateMap {

	public static void main(String[] args) {

		HashMap<Integer,String> nameMap = new HashMap<Integer,String>();
		
		nameMap.put(1, "Naresh");
		nameMap.put(2, "Mahesh");

		System.out.println("Names are as follows:");
		
		for(Entry<Integer, String> entry: nameMap.entrySet()){
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
		
		//nameMap.put(2, "Rajesh");
		nameMap.replace(2, "Mahesh", "Rajesh");
		
		System.out.println("Names are as follows:");
		
		for(Entry<Integer, String> entry: nameMap.entrySet()){
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
	}

}
