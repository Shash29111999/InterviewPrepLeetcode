package com.java.medium;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;

/*
Algorithm: 3Sum (Using Sorting + Two Pointers)

1. Sort the array.
2. Loop through each element (index i).
3. Skip duplicate values for i to avoid duplicate triplets.
4. For each i:
      - Set left = i + 1
      - Set right = last index
5. While left < right:
      - Calculate sum = nums[i] + nums[left] + nums[right]
      - If sum == 0:
            -> Add triplet to result
            -> Skip duplicate values for left and right
            -> Move both pointers
      - If sum < 0:
            -> Move left pointer (to increase sum)
      - If sum > 0:
            -> Move right pointer (to decrease sum)
6. Return the result list.

Time Complexity: O(n^2)
Space Complexity: O(1) (excluding result list)
*/

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		
		List< List<Integer> > list = threeSum(nums);
		
		System.out.print(list);

	}
	
	public static  List<List<Integer>> threeSum( int[] nums) {
		
		List< List<Integer> > result = new ArrayList<>();
		
		Arrays.sort(nums);
		
		for( int i = 0 ; i < nums.length - 2 ; i++ ) {
			
			
			if( i > 0 && nums[i] == nums[i - 1 ]) continue;
			
			int left = i + 1;
			int right = nums.length - 1;
			
			while( left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				
				if(sum == 0) {
					result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
					
					while( left < right && nums[left] == nums[left + 1] ) left++;
					while( left < right && nums[right] == nums[right - 1] ) right--;
					                                          
					 
					left++;
					right--;
				} else if( sum < 0) 
					left++;
				else 
					right--;
				
				}
			
			
		}
		
		
		
		return result;
		
		
	}

}
