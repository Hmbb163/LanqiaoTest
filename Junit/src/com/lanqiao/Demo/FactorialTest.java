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

//指定使用参数化运行器来运行
@RunWith(Parameterized.class)
public class FactorialTest {

	private int expected ;    //测试用例的预期结果
    private int inputData ;   //测试用例的输入数据
    private Factorial  f = null;
    
  //在该测试类的--每一个测试方法执行前--实例化被测试类
    @Before
    public void setUp() {
        f = new Factorial();
    }
	
	/*
	 * //测试用例数据集
	 * 
	 * @Parameters public static Collection<Object[]> testData(){ Object[][] obj = {
	 * {0,0},//0 {1,1},//1 {2,2},//2 {120,5},//3 {362880,9},//4 {3628800,10},//5
	 * {0,11}//6 }; return Arrays.asList(obj); }
	 */
    
    
	/*
	 * //测试用例数据集
	 * 
	 * @Parameters public static Collection<Object[]> testData() throws IOException
	 * { //从txt文件中读取测试用例数据 Object[][] obj = FileReader.readTxt("D:\\testData.txt",
	 * 5, 2); return Arrays.asList (obj); }
	 */
    
    
  //测试用例数据集
    @Parameters
    public static Collection<Object[]> testData() throws IOException, BiffException{
        //从excel文件中读取测试用例数据
        Object[][] obj = FileReader.readExcel("D:\\testData.xls", 0, 7, 2);
        return Arrays.asList (obj);    
    }
    
    //构造方法
    public FactorialTest(int expected,int inputData) {
    	this.expected = expected;
        this.inputData = inputData;
    }


    //测试方法
    @Test
    public void testGetFactorial () {
    	System.out.println("测试用例预期输出: "+this.expected+"\n测试用例输入为："+this.inputData);
        Assert.assertEquals(this.expected, f.getFactorial(this.inputData));
    }

}

