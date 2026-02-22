package com.java.medium;

/*
Algorithm: Expand Around Center

1. Every palindrome has a center.
2. For each index i in the string:
      - Check odd-length palindrome (center at i)
      - Check even-length palindrome (center between i and i+1)
3. Expand left and right while characters match.
4. Calculate the length of palindrome found.
5. If this length is greater than previous maximum,
      update start and end indices.
6. Return substring from start to end.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		String s = "babad";
		
		String result = longestPalindromicSubsring(s);
		
		System.out.print("Result :" + result);

	}
	
	public static String longestPalindromicSubsring(String s) {
		
		if( s.length() <= 1 || s == null ) return s;
		int start = 0 , end = 0;
				
		for(int i = 0 ; i < s.length() ; i++ ) {
			
			int len1 = checkExpansion( s , i , i );
			int len2 = checkExpansion( s , i , i + 1);
			
			int maxLen = Math.max(len1, len2);
			
			 if (maxLen > end - start) {
	                start = i - (maxLen - 1) / 2;
	                end = i + maxLen / 2;
	            }
			
			
		}
		
		return s.substring(start, end + 1);
		
	}
	
	public static int checkExpansion(String s , int left, int right) {
		
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		return right - left - 1;
	}

}
