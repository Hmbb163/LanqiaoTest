package com.lanqiao.Demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import jxl.read.biff.BiffException;

//ָ��ʹ�ò�����������������
@RunWith(Parameterized.class)
public class FactorialTest {

	private int expected ;    //����������Ԥ�ڽ��
    private int inputData ;   //������������������
    private Factorial  f = null;
    
  //�ڸò������--ÿһ�����Է���ִ��ǰ--ʵ������������
    @Before
    public void setUp() {
        f = new Factorial();
    }
	
	/*
	 * //�����������ݼ�
	 * 
	 * @Parameters public static Collection<Object[]> testData(){ Object[][] obj = {
	 * {0,0},//0 {1,1},//1 {2,2},//2 {120,5},//3 {362880,9},//4 {3628800,10},//5
	 * {0,11}//6 }; return Arrays.asList(obj); }
	 */
    
    
	/*
	 * //�����������ݼ�
	 * 
	 * @Parameters public static Collection<Object[]> testData() throws IOException
	 * { //��txt�ļ��ж�ȡ������������ Object[][] obj = FileReader.readTxt("D:\\testData.txt",
	 * 5, 2); return Arrays.asList (obj); }
	 */
    
    
  //�����������ݼ�
    @Parameters
    public static Collection<Object[]> testData() throws IOException, BiffException{
        //��excel�ļ��ж�ȡ������������
        Object[][] obj = FileReader.readExcel("D:\\testData.xls", 0, 7, 2);
        return Arrays.asList (obj);    
    }
    
    //���췽��
    public FactorialTest(int expected,int inputData) {
    	this.expected = expected;
        this.inputData = inputData;
    }


    //���Է���
    @Test
    public void testGetFactorial () {
    	System.out.println("��������Ԥ�����: "+this.expected+"\n������������Ϊ��"+this.inputData);
        Assert.assertEquals(this.expected, f.getFactorial(this.inputData));
    }

}

