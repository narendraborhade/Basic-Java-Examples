package com.example.immutable;

import java.util.Date;

public final class Student {

	private int sid;
	private String name;
	private Date dob;
	
	public Student(int sid, String name, Date dob) {
		super();
		this.sid = sid;
		this.name = name;
		this.dob = new Date( dob.getTime() );
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public Date getDob() {
		return dob;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sid;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	
	
	
}
