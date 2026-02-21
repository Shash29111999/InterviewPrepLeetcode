package com.java.hello;

public class BinaryAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "11", b = "1";
		
		
		System.out.print(binaryAdd(a, b));

	}

	public static String binaryAdd( String a , String b ) {
		
		
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		StringBuilder result = new StringBuilder();
		
		while( i >= 0 || j >= 0) {
			int sum = carry;
			if( i >= 0 ) sum += a.charAt(i) - '0';
			if( j >= 0 ) sum += b.charAt(j) - '0';
			
			result.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;
		}
		if( carry != 0) result.append(carry);
		
		return result.reverse().toString();		
			
			
		
	}
}
