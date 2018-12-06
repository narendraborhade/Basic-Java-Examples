/**
 * @author Narendra Borhade
 *
 */
package com.example.java7;

public class SwitchCaseExample {

	public static void main(String[] args) {

		String cityId = "C3"; 
		testingSwitchString(cityId);
	}

	private static void testingSwitchString(String cityId){
		
		final String C1 = "Pune";
		final String C2 = "Mumbai";
		final String C3 = "Delhi";
		final String C4 = "Chennai";
		
		switch(cityId){
		
		case "C1" : System.out.println(C1);
				  break;
		case "C2" : System.out.println(C2);
		  		  break;
		case "C3" : System.out.println(C3);
		  		  break;
		case "C4" : System.out.println(C4);
		  		  break;
		}
	}
}
