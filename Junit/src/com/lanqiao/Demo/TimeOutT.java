package com.lanqiao.Demo;

public class TimeOutT {

	public int add(int a,int b) {
		//–›√ﬂ5000√Î
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return a+b+1;
	}
}
