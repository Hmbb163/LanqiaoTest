package cn.ncupyh.soft.smallTest;

import java.util.Iterator;
/*
 * 断点：
 * F6 单步执行，遇到方法会将方法当作一条语句执行
 * F5 逐条执行，遇到方法会进入并执行每一条语句
 * F7 跳出正在调试的方法，将方法当作一条语句执行
 * F8 断点之间的跳跃，如果没有断点，则直接完成程序
 */
public class Duandian {
	public static void main(String[] args) {
		for(int i = 0;i<2;i++) {
			System.out.println("hello debug"+i);
		}
		System.out.println("goodbye debug");
	}
}
