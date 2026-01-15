package com.java.hello;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s =  "III"; 	
		System.out.print(RomanToInteger(s));
	}
	
	public static int RomanToInteger(String s) {
		
		
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int sum = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			int current =map.get( s.charAt(i));
			
			
			
			if(i+1 < s.length() && current < map.get(s.charAt( i + 1)))
			sum -= current;
			else
			sum += current;
			
		}
		
		
		
		
		return sum;
	}

}
