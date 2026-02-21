package com.java.hello;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	
		
		String[] strs = {"flower","flow","floght"};
		
		System.out.println(longestCommonPrefix(strs));
		

	}
	  public static String longestCommonPrefix(String[] strs) {
	        

	        if(strs.length == 0) return "";

	        String prefix = strs[0];

	        for( int i = 0 ; i < prefix.length() ; i++){
	            for(int j = 1 ; j < strs.length ; j++ ){

	                char current = prefix.charAt(i);

	                if(i >= strs[j].length() || strs[j].charAt(i) !=  current)
	                    return prefix.substring(0 , i);


	            }


	        }

	        return prefix;
	    }
}
