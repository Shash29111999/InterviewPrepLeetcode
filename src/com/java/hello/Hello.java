/**
 * 
 */
package com.java.hello;

/**
 * 
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		
		int target = 9;
		
		
		int[] result = new int[2]; 
		result = TwoSum(nums , target);
		
		System.out.print(result[0] + " " + result[1]);

	}
	
	public static int[] TwoSum(int[] nums , int target) {
		
		for(int i = 0 ; i < nums.length - 1 ; i++) {
			
			for(int j = i+1 ; j <nums.length ; j++) {
				
				if( nums[i] + nums[j] == target) 
					
					return new int[] {i , j};
					
				
			}
			
		}
		
		return new int[] {0 , 0};
		
	}


}
