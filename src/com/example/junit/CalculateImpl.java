package com.example.junit;

public class CalculateImpl implements Calculate{

	long c;
	
	@Override
	public long add(long a, long b) {
		c = a+b;
		return c;
	}

	@Override
	public long sub(long a, long b) {
		c = a-b;
		return c;
	}

	@Override
	public long mul(long a, long b) {
		c = a*b;
		return c;
	}

	@Override
	public long div(long a, long b) {
		c = a/b;
		return c;
	}

}
