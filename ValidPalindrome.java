package com.zoho.test;

import java.util.Scanner;

public class ValidPalindrome {
	static boolean palindromeCheck(String str, int j,int noOfChar,int len) {
		int backward = len - 1, forward = 0;
		final int minLen = 2;
		while (forward < backward) {
			if (str.charAt(forward) != str.charAt(backward))
				if (j <= noOfChar && len > minLen) {
					if (str.charAt(forward + 1) != str.charAt(backward)) {
						j++;
						if (palindromeCheck(removeChar(str, backward, len), j,noOfChar,len))
							return true;
						else
							return false;
					} else {
						j++;
						if (palindromeCheck(removeChar(str, forward, len), j,noOfChar,len))
							return true;
						else
							return false;
					}
				} else
					return false;
			forward++;
			backward--;
		}
		System.out.println("string after possible modification is " + str);
		return true;
	}
	static String removeChar(String str, int backward, int len) {
		int i;
		StringBuilder strB = new StringBuilder();
		for (i = 0; i < len; i++) {
			if (i == backward)
				continue;
			strB.append(str.charAt(i));
		}
		str = strB.toString();
		return str;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to validate ");
		String str = input.next();
		int len = str.length();
		final int invalidLen = 1;  
		if(len>invalidLen) {
		System.out.print("Enter the maximum no. of characters to change ");
		int noOfChar = input.nextInt();
		input.close();
		String strL = str.toLowerCase();
		int j = 1;
		if (palindromeCheck(strL, j,noOfChar,len))
			System.out.println("It is a valid palindrome");
		else
			System.out.println("It is not a valid palindrome");
		} else
			System.out.println("String length of null or 1 is not a valid palindrome");
	}
}
