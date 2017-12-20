package com.example.immutable;

import java.util.ArrayList;

public class CountryMain {

	public static void main(String[] args) {

		String countryName = "INDIA";
		ArrayList listOfStates = new ArrayList();
		listOfStates.add("MH");
		listOfStates.add("GJ");
		listOfStates.add("KA");
		listOfStates.add("TN");
		Country country = new Country(countryName, listOfStates);
		
		System.out.println(country.getListOfStates());
	}

}
