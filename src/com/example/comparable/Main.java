package com.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Name name5 = new Name(5,"Parul");
		Name name1 = new Name(1,"Narendra");
		Name name4 = new Name(4,"Sachin");
		Name name3 = new Name(3,"Abhijit");
		Name name2 = new Name(2,"Gajanan");
		
		List<Name> nameList = new ArrayList<Name>();
		nameList.add(name5);
		nameList.add(name1);
		nameList.add(name4);
		nameList.add(name3);
		nameList.add(name2);
		
		
		System.out.println("Name List Before Sort:");
		
		for(int i = 0; i < nameList.size(); i++){
			Name name = (Name) nameList.get(i);
			System.out.println("Id: "+name.getId()+"||"+"Name:"+name.getFirstName());
		}
		
		 Collections.sort(nameList);
		 
		 System.out.println("Name List After Sort:");
			
		 for(int i = 0; i < nameList.size(); i++){
				Name name = (Name) nameList.get(i);
				System.out.println("Id: "+name.getId()+"||"+"Name:"+name.getFirstName());
			}
			
	}

}
