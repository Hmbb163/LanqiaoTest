package com.lanqiao.Demo;

public class TimeOutT {

	public int add(int a,int b) {
		//����5000��
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return a+b+1;
	}
}
