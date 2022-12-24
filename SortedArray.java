package com.zoho.test;

import java.util.Arrays;

public class SortedArray {
	public static void arraySorting(int[] arr) {
		int len = arr.length;
		int [] squaredArr = new int[len];
		for(int i = 0;i<=len-1;i++) {
			squaredArr[i] =(int) Math.pow(arr[i], 2);
		}
        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - i - 1; j++)
                if (squaredArr[j] > squaredArr[j + 1]) {
                    int var = squaredArr[j];
                    squaredArr[j] = squaredArr[j + 1];
                    squaredArr[j + 1] = var;
                }
		System.out.println(Arrays.toString(squaredArr));
	}		
	public static void main(String[] args) {
		int[] arr = {-4,-1,0,3,10};
		arraySorting(arr);
	}

}
