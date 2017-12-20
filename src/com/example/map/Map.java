package com.example.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer,String> nameMap = new HashMap<Integer,String>();
		
		nameMap.put(null, "Naresh");
		nameMap.put(null, "Mahesh");

		System.out.println("Names are as follows:");
		
		for(Entry<Integer, String> entry: nameMap.entrySet()){
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
	}

	
}
