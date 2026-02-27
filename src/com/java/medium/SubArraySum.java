package com.java.medium;
import java.util.*;
public class SubArraySum {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		int k = 3;
		
		int countSubArray = subArraySumHash(nums , k);
		
		System.out.print(countSubArray + " countSubArray");
		

	}
	
	public static int subarraySum(int[] nums, int k) {
		
		int countSubarray = 0;
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			int sum = 0;
			
			for(int j = i ; j < nums.length ; j++) {
				
				sum += nums[j];
				if(sum == k) countSubarray++;
			}
			
		}
		
		return countSubarray;
	}
	
	public static int subArraySumHash(int[] nums, int k) {
		
		int maxCount = 0;
		HashMap<Integer , Integer> map = new HashMap<>();
		map.put( 0 , 1);
		int sum =0;
		for( int num : nums) {
			
			sum += num;
			
			if(map.containsKey(sum - k)) {
				maxCount += map.get( sum  - k);
			}
			
			map.put(sum, map.getOrDefault(sum, 0) + 1);
			
			
			
			
			
		}
		
		return maxCount;
		
		
		
	}

}
