package com.lanqiao.Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	 // ʵ������������
    Calculator calculator = new Calculator();
    
 // ��������testcase_01�Ĳ��Է��� 
    @Test
    public void testcase_01() {
        assertEquals("����ԭ��Ϊ:",5, calculator.add(2, 3),0.1);//1-->����ʱ,չ�ִ���ԭ��!!!//-1 -->�����͵ľ�ȷ��!!!
    }    
    
//    ��������testcase_02�Ĳ��Է���
    @Test
    public void testcase_02() {
    	assertEquals(10,calculator.substract(10, 0));
    }
    
    @Test
    public void testcase_03() {
    	assertEquals("����ԭ��Ϊ:",10,calculator.cheng(5, 20));
    }

    @Test
    public void testcase_04() {
    	assertEquals(3,calculator.chu(18, 6));
    }
}
