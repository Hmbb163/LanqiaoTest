package cn.lanqiao.unit;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.lanqiao.Utils;

/**
 * 1. ��ʹ�ü�ѭ�����Ƿ��Ա���Դ���� Utils ���е� stringStyle ������� 6 ����Ԫ����������
 * 2. �����·� UtilsTest ������д��Ԫ���Դ������ݡ�
 * 3. �ڲ������õ��Ķ��� Assert �����ʹ�� org.junit ���е� Assert ��
 */
public class UtilsTest {

//    @Test
//    public void testStringStyle01(){
//        // TODO ����д��Ԫ���Դ���
//        Assert.assertEquals("123456789012", Utils.stringStyle("123456789012", 3, 12));//0
//    }
//
//    @Test
//    public void testStringStyle02(){
//        // TODO ����д��Ԫ���Դ���
//        Assert.assertEquals("12345678901 ", Utils.stringStyle("12345678901", 3, 12));//1
//    }
//
//    @Test
//    public void testStringStyle03(){
//        // TODO ����д��Ԫ���Դ���
//        Assert.assertEquals("1234567890  ",Utils.stringStyle("1234567890", 3, 12));//2
//    }
//
//    @Test
//    public void testStringStyle04(){
//        // TODO ����д��Ԫ���Դ���
//        Assert.assertEquals("123         ", Utils.stringStyle("123", 3, 12));//3
//    }
//
//    @Test
//    public void testStringStyle05(){
//        // TODO ����д��Ԫ���Դ���
//        Assert.assertEquals( "�ַ������ȱ�����"+3+"~"+12+"λ", Utils.stringStyle("1", 3, 12));//.
//    }
//
//    @Test
//    public void testStringStyle06(){
//        // TODO ����д��Ԫ���Դ���
//        Assert.assertEquals("�ַ�������Ϊ��", Utils.stringStyle(null, 3, 12));//.
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
    	 assertEquals("�ַ������ȱ�����3~12λ",Utils.stringStyle("12", 3, 12));
     }
     public void test() {
    	 assertEquals("�ַ������ȱ�����3~12λ",Utils.stringStyle("12", 3, 12));
     }
}
