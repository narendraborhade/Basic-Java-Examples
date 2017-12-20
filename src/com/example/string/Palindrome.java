package com.example.string;

public class Palindrome {

	public static void main(String[] args) {

		String str = "ios";
		
		/*StringBuffer buffer = new StringBuffer(str).reverse();
		
		String str2 = buffer.toString();
		
		if(str.equals(str2)){
			System.out.println("str is palindrome");
		}else{
			System.out.println("str is NOT palindrome");
		}*/
		
		boolean isPalindrome = palindrome(str);
		
		if(isPalindrome){
			System.out.println("str is palindrome");
		}else{
			System.out.println("str is NOT palindrome");
		}
	}
	
	public static boolean palindrome(String str){
		
		boolean isPalindrome=true;
		
		int l = str.length();
		int j = l-1;
		
		for(int i=0; i<(l/2); i++){
			
			if(str.charAt(i) != str.charAt(j)){
				isPalindrome = false;
				break;
			}
			j--;
		}
		return isPalindrome;
	}

}
