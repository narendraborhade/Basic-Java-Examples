/**
 * @author Narendra Borhade
 *
 */
package com.example.exception;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		int result = 0;
		
		try{
			result = 10/0;
			System.out.println("Result:" +result);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Caught ArithmeticException");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Caught Unknown Exception");
		}finally{
			System.out.println("In Finally Block Result:" +result);
		}
	}

}
