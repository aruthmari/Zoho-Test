package com.zoho.test;

import java.util.Arrays;

public class VowelArrange {
	public static String vowelProcess(String str) {
		int len = str.length(); int j = len-1;
		char[] st = str.toCharArray();
		char f,l;
		for(int i = 0;i < (len-1)/2;i++) {
			f = st[i];
			if(f == 'a'||f == 'e'||f == 'i'||f == 'o'||f == 'u') {
				while(j>i) {
					l = st[j];
					j--;
					if(l == 'a'||l == 'e'||l == 'i'||l == 'o'||l == 'u') {
						st[j+1] = f;
						st[i] = l;
						break;
					}
				}
			}				
		}
		str = Arrays.toString(st);
		return str;
	}
	public static void main (String[] args) {
		System.out.println(vowelProcess("zoho interview"));
	}
}
