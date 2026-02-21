package com.java.hello;

public class LastWordCount {

	public static void main(String[] args) {
		
		String s = "luffy is still joyboy";
		
		int n = lastWordCount(s);
		
		System.out.print("Last Word Count: " + n);
	}
	
	public static int lastWordCount(String s) {
		String[] splitted = s.trim().split(" ");
        int lastIndex = splitted.length - 1;
        return splitted[lastIndex].length();
	}
}
