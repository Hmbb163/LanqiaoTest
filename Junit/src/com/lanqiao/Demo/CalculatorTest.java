package com.lanqiao.Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	 // 实例化被测试类
    Calculator calculator = new Calculator();
    
 // 测试用例testcase_01的测试方法 
    @Test
    public void testcase_01() {
        assertEquals("错误原因为:",5, calculator.add(2, 3),0.1);//1-->出错时,展现错误原因!!!//-1 -->浮点型的精确度!!!
    }    
    
//    测试用例testcase_02的测试方法
    @Test
    public void testcase_02() {
    	assertEquals(10,calculator.substract(10, 0));
    }
    
    @Test
    public void testcase_03() {
    	assertEquals("错误原因为:",10,calculator.cheng(5, 20));
    }

    @Test
    public void testcase_04() {
    	assertEquals(3,calculator.chu(18, 6));
    }
}
