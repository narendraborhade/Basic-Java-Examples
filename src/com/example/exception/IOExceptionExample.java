/**
 * @author Narendra Borhade
 *
 */
package com.example.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IOExceptionExample {

	public static void main(String[] args){
		
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get("D:\\GitProjects\\Basic Java\\src\\com\\example\\exception\\file"));
			System.out.println(lines);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File is not present on location");
		}
		
		
	}

}
