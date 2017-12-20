package com.example;

public class FibonacciRecursion {

	public static void main(String[] args) {

		int n=5, fibo;
		
		fibo = fibonacci(10);
		
		System.out.println("Fibonacci:" + fibo);
	}

	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
