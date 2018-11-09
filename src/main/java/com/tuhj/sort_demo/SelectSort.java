package com.tuhj.sort_demo;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,17,4,1,13,8,9,7,6,5,10,18,0,2};
		System.out.println("排序前："+Arrays.toString(arr));
		selectSort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
	}
	
	public static void selectSort(int[] arr) {
		//遍历所有的数
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			//把当前遍历的数和后面所有的数一次进行比较，并记录下最小的数的下标
			for (int j = i+1; j < arr.length; j++) {
				//如果后面比较的数比记录的最小的数小
				if (arr[minIndex] > arr[j]) {
					//记录下最小的那个数的下标
					minIndex = j;
				}
			}
			//如果最小的数当前遍历的数的下标不一致，说明下标为minIndex的数比当前遍历的数更小
			if (i!=minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
