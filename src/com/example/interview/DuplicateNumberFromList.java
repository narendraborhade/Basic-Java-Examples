package com.example.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Find out duplicate number from List*/

public class DuplicateNumberFromList {

	public static void main(String[] args) {
	
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=1; i<=30; i++){
			numbers.add(i);
		}
		
		numbers.add(10);
		
		Set<Integer> duplicateNumber = new HashSet<Integer>();
		
		for(int i=1; i<numbers.size(); i++){
			
			int number = 	numbers.get(i);
			
			if(!duplicateNumber.add(number)){
				
				System.out.println("Duplicate:" + number);
			}
		}
		
		 
		
		for(int number: numbers){
		
			duplicateNumber.add(number);
		}
		
		
	}
	
	

}
