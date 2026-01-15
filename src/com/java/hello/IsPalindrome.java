package com.java.hello;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1342931;
		
		System.out.print(isPalindrome(x));
		
		

	}
	
	 public static boolean isPalindrome(int x) {
	        
	        if(x <= 0) return false;

	        String s = String.valueOf(x);
	        int n = s.length() - 1;
	        for( int i = 0 ; i < s.length()/2 ; i++){

	            if( s.charAt(i) != s.charAt(n))
	                return false;

	            n--;

	        }

	        return true;
	    }

}
