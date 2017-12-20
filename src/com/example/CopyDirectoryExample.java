package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyDirectoryExample {

	public static void main(String[] args) {
		
		Path sourcePath      = Paths.get("C:/Users/Narendra/Desktop/PPSM/Steps to complete PPSM Generalist Experience.docx");
		Path destinationPath = Paths.get("D:/HTC/Steps to complete PPSM Generalist Experience.docx");
		
		try {
			Files.copy(sourcePath, destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
