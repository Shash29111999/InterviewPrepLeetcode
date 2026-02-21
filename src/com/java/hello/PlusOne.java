package com.java.hello;

public class PlusOne {

	public static void main(String[] args) {
		
		
		int[] digits = {4,3,2,1};
		
		int[] plusOneArray =  plusOne(digits);
		for (int i = 0; i < plusOneArray.length; i++) {
            System.out.print(plusOneArray[i] + " ");
        }
		

	}
	
	public static int[] plusOne(int[] digits) {
		
		

        for(int i = digits.length - 1 ; i >=0 ; i--){
            if( digits[i] != 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
                
            else
                digits[i] = 0;
        }

        int[] nums = new int[digits.length + 1];

        nums[0] = 1;

        return nums;
		
	}

}
