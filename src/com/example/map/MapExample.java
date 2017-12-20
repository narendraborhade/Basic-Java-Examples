package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		HashMap<Integer,String> nameMap = new HashMap<Integer,String>();
		
		nameMap.put(1, "Naresh");
		nameMap.put(2, "Mahesh");
		nameMap.put(3, "Aakash");
		nameMap.put(4, "Rakesh");
		
		System.out.println("Names are as follows:");
		
		for(Map.Entry<Integer, String> entry: nameMap.entrySet()){
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
	}

}
