package com.example.set;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<Integer> numberList = new HashSet<Integer>();
		
		numberList.add(5);
		numberList.add(15);
		numberList.add(8);
		numberList.add(5);
		numberList.add(25);
		numberList.add(12);
		numberList.add(15);
		
		System.out.println("Numbers are as follows:");
		
		for(Integer number : numberList){
			System.out.println(number);
		}
	}

}
