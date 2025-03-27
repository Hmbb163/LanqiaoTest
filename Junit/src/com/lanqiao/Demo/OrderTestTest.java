package com.lanqiao.Demo;

import org.junit.Ignore;
import org.junit.Test;

//这里报错，是因为适用于Junit5，而考试用的是Junit4
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.DEFAULT)


public class OrderTestTest {

	@Test@Ignore
	public void test1() {
		System.out.println("i'm test1()");
	}
	
	@Test
	public void test2() {
		System.out.println("i'm test2()");
	}
	
	@Test
	public void test3() {
		System.out.println("i'm test3()");
	}
	
	@Test
	public void test4() {
		System.out.println("i'm test4()");
	}
	

}
