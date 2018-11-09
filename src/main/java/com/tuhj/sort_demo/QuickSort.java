package com.tuhj.sort_demo;

import java.util.Arrays;

/**
 * 交换排序-快速排序
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,17,4,1,13,8,9,7,6,5,10,18,0,2};
		System.out.println("排序前："+Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("排序后："+Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if (start<end) {
			//把数组中的第0个数字作为标准数
			int stard = arr[start];
			//记录需要排序的下标
			int low = start;
			int high = end;
			//循环找比标准数大的数和比标准数小的数
			while (low<high) {
				//右边的数字比标准数大
				while (low<high&&stard<=arr[high]) {
					high--;
				}
				//使用右边的数字替换左边的数字
				arr[low] = arr[high];
				//如果左边的数字比标准数小
				while (low<high&&arr[low]<=stard) {
					low++;
				}
				arr[high] = arr[low];
			}
			//把标准数赋给低所在的位置的元素
			arr[low] = stard;
			//处理所有的小的数字
			quickSort(arr, start, low);
			//处理所有的大的数字
			quickSort(arr, low+1, end);
		}
	}

}
