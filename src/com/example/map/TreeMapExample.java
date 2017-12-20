package com.example.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer,String> capitalMap = new TreeMap<Integer,String>();
		
		capitalMap.put(1, "Delhi");
		capitalMap.put(3, "Beijing");
		capitalMap.put(5, "Colombo");
		capitalMap.put(1, "Delhi");
		capitalMap.put(2, "Thimphu");
		
		System.out.println("Capitals are:");
		
		for(Entry<Integer, String> entry: capitalMap.entrySet()){
			System.out.println(entry.getKey() +"-"+ entry.getValue());
			
		}
		
	}

}
