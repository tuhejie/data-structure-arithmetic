package com.tuhj.sort_demo;

import java.util.Arrays;

/**
 * 交换排序-冒泡排序
 * @title TODO
 * @Description:
 * @Author:hard
 * @Date:2018年11月8日
 * @param 
 * @return
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,17,4,1,13,8,9,7,6,5,10,18,0,2};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		//控制共比较多少轮
		for (int i = 0; i < arr.length-1; i++) {
			//控制比较的次数
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
