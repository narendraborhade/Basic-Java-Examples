/**
 * @author Narendra Borhade
 *
 */
package com.example.string;

import java.util.HashMap;

public class FirstNonRepeatCharacterInString {

	public static void main(String[] args) {

		String str = "narendra";
		
		System.out.println("First Non Repeat Character in String is: " +firstNonRepeatCharacter(str));
	}

	public static Character firstNonRepeatCharacter(String str){
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character c;

		for(int i=0; i<str.length(); i++){
			
			c= str.charAt(i);
			
			if(map.containsKey(c)){
				
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		for(int i=0; i<str.length(); i++ ){
			
			c=str.charAt(i);
			
			if(map.get(c)==1){
				return c;
			}
		}
		return null;
	}
}
