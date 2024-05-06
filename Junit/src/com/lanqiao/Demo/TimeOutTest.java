package com.lanqiao.Demo;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeOutTest {

	TimeOutT to =  new TimeOutT();
	
	/*1.@Test注解Timeout
	 * //@Test注解中设置了超时时间为1000毫秒
	 * 
	 * @Test(timeout = 6000) //表示测试方法执行时会进行超时测试，超时时间为 1000 毫秒。 public void test() {
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
