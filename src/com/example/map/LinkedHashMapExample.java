package com.example.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String,String> capitalMap = new LinkedHashMap<String,String>();
		
		capitalMap.put("1", "Delhi");
		capitalMap.put("3", "Beijing");
		capitalMap.put("5", "Colombo");
		capitalMap.put("1", "Delhi");
		capitalMap.put("2", "Thimphu");
		
		System.out.println("Capitals are:");
		
		for(Entry<String, String> entry: capitalMap.entrySet()){
			System.out.println(entry.getKey() +"-"+ entry.getValue());
			
		}
	}

}
