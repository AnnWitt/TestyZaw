package com.sda.testing.solution.parametrized;

public class PalindromeChecker {

	public static boolean isPalindrome(String word) {

		//additional requirement - let's omit spaces in our check
		String sanitized = word.replaceAll(" ", "");
		return new StringBuilder(sanitized).reverse().toString().equalsIgnoreCase(sanitized);
		//String sanitized = word.replaceAll(" ", "");

	}
}
