package com.zoho.test;

import java.util.Arrays;

public class ArrayRotation {
	static int last(int[] arr,int dim) {
		int i,backup,len = arr.length-1;
		for(i = dim ;i<len ;i++) {
			backup = arr[i];
			arr[i] = arr[len];
			arr[len--] = backup;
		}
		return 0;
	}
	static int first(int[] arr,int dim) {
		int backup,i,j=0;
		for(i = dim-1;i>j ;i--) {
			backup = arr[i];
			arr[i] = arr[j];
			arr[j++] = backup;
		}
		last(arr,dim);
		last(arr,0);
		return 0;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int dim = 2;
		first(arr,dim);
		System.out.println(Arrays.toString(arr));
	}
}
