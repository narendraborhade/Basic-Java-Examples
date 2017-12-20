package com.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student(1, "A", 10);
		Student s2 = new Student(3, "B", 12);
		Student s3 = new Student(5, "C", 10);
		Student s4 = new Student(4, "D", 9);
		Student s5 = new Student(2, "E", 12);
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(s5);
		studentList.add(s3);
		studentList.add(s2);
		studentList.add(s4);
		studentList.add(s1);
		
		System.out.println("Student before sort:");
		
		for(int i=0; i<studentList.size(); i++){
			Student s = studentList.get(i);
			System.out.println(s);
		}
		
		AgeComparator ageComparator = new AgeComparator();
		
		Collections.sort(studentList,ageComparator);  
		
		Iterator itr = studentList.iterator();  
		
		System.out.println("Student after age sort:");
		
		while(itr.hasNext()){  
		
			Student st=(Student)itr.next();  
			System.out.println(st);
		}  
		
		
		NameComparator nameComparator = new NameComparator();
		
		Collections.sort(studentList,nameComparator);  
		
		Iterator nameItr = studentList.iterator();  
		
		System.out.println("Student after name sort:");
		
		while(nameItr.hasNext()){  
		
			Student st=(Student)nameItr.next();  
			System.out.println(st);
		}
		
		IdCompartor idComparator = new IdCompartor();
		
		Collections.sort(studentList,idComparator);  
		
		Iterator idItr = studentList.iterator();  
		
		System.out.println("Student after id sort:");
		
		while(idItr.hasNext()){  
		
			Student st=(Student)idItr.next();  
			System.out.println(st);
		}
		
	}

}
