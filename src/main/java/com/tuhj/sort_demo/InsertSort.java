package com.tuhj.sort_demo;

import java.util.Arrays;

/**
 * 插入排序-快速插入排序
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,17,4,1,13,8,9,7,6,5,10,18,0,2};
		System.out.println("排序前："+Arrays.toString(arr));
		insertSort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
	}
	
	public static void insertSort(int[] arr) {
		//遍历所有数字
		for (int i = 1; i < arr.length; i++) {
			//如果当前数字比前一个数字小
			if (arr[i]<arr[i-1]) {
				//把当前遍历数字存起来
				int temp = arr[i];
				int j;
				//遍历当前数字前面所有的数字
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					//把前一个数字赋给后一个数字
					arr[j+1]=arr[j];
				}
				//把临时变脸（外层for循环的当前元素）赋给不满足条件的最后一个元素
				arr[j+1]=temp;
			}
		}
	}

}
