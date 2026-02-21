package com.java.hello;

public class RemoveElement {

	public static void main(String[] args) {
		
		
			int[] arr = {3,2,2,3};
			int val = 3;
			
			System.out.print(removeDuplicate(arr,  val));

	}
	
	
	public static int removeDuplicate(int[] arr, int val) {
		
		
		int k = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(val != arr[i]) 
				arr[k++] = arr[i];
			
			
		}
		
		return k;
		
	}
}
