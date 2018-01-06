/**
 * @author Narendra Borhade
 *
 */
package com.example.exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		/*String city = null;
		
		try{
			if(city.equals("Pune")){
				System.out.println("City is Pune");
			}
		}catch(NullPointerException e){
			System.out.println("City is NULL");
		}*/
		
		int r = getValue() * 10;
		
		System.out.println(r);
		
	}
	
	private static int getValue(){
		return (Integer) null;
	}

}
