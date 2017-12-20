package com.example.comparable;

public class Name implements Comparable<Name>{

	private int id;
	private String firstName;
	
	public Name(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Name [id=" + id + ", firstName=" + firstName + "]";
	}

	@Override
	public int compareTo(Name name) {
		return (this.id < name.id ) ? -1: (this.id > name.id ) ? 1:0 ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
