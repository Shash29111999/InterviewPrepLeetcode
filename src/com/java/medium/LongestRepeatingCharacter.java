package com.java.medium;

/*
 ================================================================
 Problem: 424. Longest Repeating Character Replacement

 Goal:
 Given a string s (only uppercase letters) and an integer k,
 we can replace at most k characters in the string.
 Find the length of the longest substring that can be made
 of the same character after performing at most k replacements.

 ---------------------------------------------------------------
 APPROACH: Sliding Window + Frequency Array

 Key Idea:
 For any window (substring),
     replacements needed = window size - max frequency character

 If:
     window size - maxFreq <= k
 → window is valid

 If:
     window size - maxFreq > k
 → shrink window from left

 ---------------------------------------------------------------
 Steps:
 1. Use a sliding window (two pointers: left & right).
 2. Maintain a frequency array of size 26.
 3. Track maxFreq (most frequent character in current window).
 4. Expand right pointer.
 5. If window becomes invalid, move left pointer.
 6. Track maximum valid window length.

 Time Complexity: O(N)
 Space Complexity: O(1) (fixed 26 array)
 ================================================================
*/

public class LongestRepeatingCharacter {

    public static void main(String[] args) {
        
        String s = "AABABBA";
        int k = 1;
        
        int maxCount = characterReplacement(s, k);
        
        System.out.print("MaxCount :" + maxCount);
    }
    
    public static int characterReplacement(String s , int k) {
        
        // Frequency array for A-Z
        int[] charCount = new int[26];
        
        int left = 0;        // Left pointer of sliding window
        int maxLen = 0;      // Maximum valid substring length
        int maxFreq = 0;     // Highest frequency of single character in window
        
        // Expand window using right pointer
        for(int right = 0 ; right < s.length(); right++) {
            
            // Increase frequency of current character
            charCount[s.charAt(right) - 'A']++;
            
            // Update maximum frequency in current window
            maxFreq = Math.max(maxFreq, charCount[s.charAt(right) - 'A']);
            
            // If replacements needed > k, shrink window
            while( right - left + 1 - maxFreq > k) {
                
                // Reduce frequency of left character
                charCount[s.charAt(left) - 'A']--;
                
                // Move left pointer forward
                left++;
            }
            
            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1 );
        }
        
        return maxLen;
    }
}