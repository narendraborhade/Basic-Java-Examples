package com.example.objectcreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) {

		//Objects created using New
		MyObject object1 = new MyObject();
		object1.getMessage();
		
		//Objects created using class.forName
		try {
			MyObject object2 = (MyObject) Class.forName("com.example.objectcreation.MyObject").newInstance();
			object2.getMessage();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//using clone
		try {
			MyObject object3 = (MyObject) object1.clone();
			object3.getMessage();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//object deserialization
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("data.obj"));
			MyObject object4 = (MyObject) in.readObject();
			object4.getMessage();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
