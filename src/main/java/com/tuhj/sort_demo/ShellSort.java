package com.tuhj.sort_demo;

import java.util.Arrays;

/**
 * 快速排序-希尔排序
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,17,4,1,13,8,9,7,6,5,10,18,0,2};
		System.out.println("初始排序结果："+Arrays.toString(arr));
		shellSort(arr);
		System.out.println("最终排序结果："+Arrays.toString(arr));

	}
	
	public static void shellSort(int[] arr) {
		int k = 1;
		//遍历所有步长
		for (int d=arr.length/2; d>0; d/=2) {
			//遍历所有元素
			for(int i=d;i<arr.length;i++) {
				//遍历本组中所有元素
				for(int j=i-d;j>=0;j-=d) {
					//如果当前元素大于加上步长后的那个元素
					if (arr[j]>arr[j+d]) {
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
			System.out.println("第" + k + "次排序结果：" + Arrays.toString(arr));
		}
	}

}
