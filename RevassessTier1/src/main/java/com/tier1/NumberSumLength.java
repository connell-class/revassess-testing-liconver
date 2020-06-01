package com.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String s = Long.toString(num);
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			sum += Math.pow(Character.getNumericValue(s.charAt(i)), s.length());
		}
		
		if(sum == num) {
			return true;
		}
		
		return false;
	}
}
