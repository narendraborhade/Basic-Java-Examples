/**
 * @author Narendra Borhade
 *
 */
package com.example.array;

public class CheckArrayInAscendingOrder {

	public static void main(String[] args) {

		int a[] = {1,12,3,4,15,6,7,8,9,10};
		
		boolean flag = arrayAscendingCheck(a);
		
		if(flag){
			System.out.println("Array in Ascending Order");
		}else{
			System.out.println("Array in Descending Order");
		}
	}
	
	public static boolean arrayAscendingCheck(int a[]){
		
		for(int i=0; i < a.length-1; i++){
			if(a[i] < a[i+1]){
				return true;
			} else{
				return false;
			}
		}
		return false;
	}

}
