package com.example.immutable;

import java.util.ArrayList;

public final class Country {

	 // declared private final instance variable
	 private final String countryName;
	 // Mutable object
	 private final ArrayList listOfStates;
	 
	 public Country(String countryName, ArrayList listOfStates) {
	  super();
	  this.countryName = countryName;
	  // Creating deep copy for mutable object
	  ArrayList tempList = new ArrayList();
	 
	  for (int i = 0; i < listOfStates.size(); i++) {
	   tempList.add(listOfStates.get(i));
	  }
	  this.listOfStates = tempList;
	 }
	 
	 public String getCountryName() {
	     // Do not need to do cloning as it is immutable object
	  return countryName;
	 }
	 
	 public ArrayList getListOfStates() {
	     // Returning cloned object 
	  //return (ArrayList) listOfStates.clone();
		 return listOfStates;
	 }
}
