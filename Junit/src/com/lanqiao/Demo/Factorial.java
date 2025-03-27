package com.lanqiao.Demo;

import org.junit.Assert;
import org.junit.Test;

public class Factorial {

	public int getFactorial(Integer num) {
		int result = 0;
		if (num >= 1 && num <= 10) {
			result = 1;
			int i = 1;
			while (i <= num) {
				result = result * i;
				i++;
			}
		}
		return result;// 相当于1-num的阶乘
	}

	
	
	/*
	 * public int hhh(Integer num) { int result = 0; if(num == 1)return 1;
	 * if(num>=1&&num<=10) { //阶乘 while(num>1) { result = num*(num-1); } } return
	 * result;
	 * 
	 * }
	 * 
	 * @Test public void test1() { Assert.assertEquals(120,hhh(5)); }
	 */
}
