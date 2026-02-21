package com.java.hello;

public class FirstOccurrenceinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack = "sadbutsad", needle = "but";
		
		int index = findTheFirstOccurenceInString(haystack, needle);
		
		System.out.print(index + " Index" );

	}
	
	public static int findTheFirstOccurenceInString(String haystack, String needle) {
		
		
		int needleLength = needle.length();
		
		for(int i = 0 ; i < haystack.length() - needleLength ; i++) {
			
			String subString = haystack.substring(i, i + needleLength);
			
			if(subString.equals(needle))
				return i;
			
			
		}
		
		return -1;
	}

}
