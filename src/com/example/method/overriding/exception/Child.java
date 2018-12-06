/**
 * @author Narendra Borhade
 *
 */
package com.example.method.overriding.exception;

import java.io.IOException;

/*Note 
 * 
 * If you're doing method overriding and handling exceptions in that case you need to take care about below things -
	
	1. If method is throwing exception in parent class then it is not necessary that you need to throw the exception 
		in child class overriden method. Child class will not show compile time issue
		
	2. If method is throwing exception in child class and same method is present in parent class in that case you also
		need to throw exception in parent class as well. If you will not do so then it will show you compile time issue
*/


public class Child extends Parent{
	
	
	public void fileUpload() throws IOException{
		
	}

}
