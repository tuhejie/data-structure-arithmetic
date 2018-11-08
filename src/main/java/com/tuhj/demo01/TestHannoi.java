package com.tuhj.demo01;

public class TestHannoi {

	public static void main(String[] args) {
		hannoi(4, 'A', 'B', 'C');
	}
	
	/**
	 * 汉诺塔问题
	 * @param n 共有n个盘子
	 * @param from	开始的柱子
	 * @param in	中间的柱子
	 * @param to	目标的柱子
	 * 无论多少盘子，都认为只有两个，上面所有的盘子和最下面的一个盘子
	 */
	public static void hannoi(int n, char from, char in, char to) {
		//只有一个盘子
		if (n==1) {
			System.out.println("第1个盘子从"+from+"移到"+to);
		}else {
			//移动上面所有的盘子到中间位置
			hannoi(n-1, from, to, in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
			//吧上面所有的盘子移动到目标位置
			hannoi(n-1, in, from, to);
		}
	}

}
