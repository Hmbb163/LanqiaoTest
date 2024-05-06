package com.lanqiao.Demo;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeOutTest {

	TimeOutT to =  new TimeOutT();
	
	/*1.@Testע��Timeout
	 * //@Testע���������˳�ʱʱ��Ϊ1000����
	 * 
	 * @Test(timeout = 6000) //��ʾ���Է���ִ��ʱ����г�ʱ���ԣ���ʱʱ��Ϊ 1000 ���롣 public void test() {
	 * assertEquals(6, to.add(2,3)); }
	 */
	
	
	@Rule
	public Timeout testTimeOut = new Timeout(5000);
	
	@Test
	public void test() {
		assertEquals(6, to.add(2, 3));
	}
	
	
	@Test
	public void test2() {
		assertEquals(6, to.add(2, 3));
	}
	
}
