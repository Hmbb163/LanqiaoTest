package cn.lanqiao.unit;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.lanqiao.Utils;

/**
 * 1. 请使用简单循环覆盖法对被测源代码 Utils 类中的 stringStyle 方法设计 6 条单元测试用例。
 * 2. 请在下方 UtilsTest 类中填写单元测试代码内容。
 * 3. 在测试中用到的断言 Assert 类务必使用 org.junit 包中的 Assert 。
 */
public class UtilsTest {

//    @Test
//    public void testStringStyle01(){
//        // TODO 请填写单元测试代码
//        Assert.assertEquals("123456789012", Utils.stringStyle("123456789012", 3, 12));//0
//    }
//
//    @Test
//    public void testStringStyle02(){
//        // TODO 请填写单元测试代码
//        Assert.assertEquals("12345678901 ", Utils.stringStyle("12345678901", 3, 12));//1
//    }
//
//    @Test
//    public void testStringStyle03(){
//        // TODO 请填写单元测试代码
//        Assert.assertEquals("1234567890  ",Utils.stringStyle("1234567890", 3, 12));//2
//    }
//
//    @Test
//    public void testStringStyle04(){
//        // TODO 请填写单元测试代码
//        Assert.assertEquals("123         ", Utils.stringStyle("123", 3, 12));//3
//    }
//
//    @Test
//    public void testStringStyle05(){
//        // TODO 请填写单元测试代码
//        Assert.assertEquals( "字符串长度必须在"+3+"~"+12+"位", Utils.stringStyle("1", 3, 12));//.
//    }
//
//    @Test
//    public void testStringStyle06(){
//        // TODO 请填写单元测试代码
//        Assert.assertEquals("字符串不能为空", Utils.stringStyle(null, 3, 12));//.
//    }
	
	//0
    @Test
    public void testStringStyle02(){

        assertEquals("123456789ABC",Utils.stringStyle("123456789ABC", 3, 12));
        
    }
    //1
    @Test
    public void testStringStyle03(){
        assertEquals("123456789AB ",Utils.stringStyle("123456789AB", 3, 12));
        
    }
    //2
    @Test
    public void testStringStyle04(){
       
        assertEquals("123456789A  ",Utils.stringStyle("123456789A", 3, 12));
    }

    //5
    @Test
    public void testStringStyle04_(){
       
        assertEquals("1234567     ",Utils.stringStyle("1234567", 3, 12));
    }

    
    //8
    @Test
    public void testStringStyle05(){
        assertEquals("1234        ",Utils.stringStyle("1234", 3, 12));
        
        
    }
    //9
    @Test
    public void testStringStyle06(){
        assertEquals("123         ",Utils.stringStyle("123", 3, 12));
        
        
    }
     //10
     @Test
     public void testStringStyle07(){
    	 assertEquals("字符串长度必须在3~12位",Utils.stringStyle("12", 3, 12));
     }
     public void test() {
    	 assertEquals("字符串长度必须在3~12位",Utils.stringStyle("12", 3, 12));
     }
}
