package com.lanqiao.Demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//ָ������������з�ʽ
@RunWith(Enclosed.class)
public class TriangleTest {
    
    //ָ��ʹ�ò�����������������
    @RunWith(Parameterized.class)
    //����isTriangle()�����Ĳ�����
    public static class IsTriangleTest{
        
        //�����������ڴ�Ų�������
        private boolean expected;
        private int lborderA;   
        private int lborderB; 
        private int lborderC;
        
        //Ϊ����������һ���������Ĺ������췽����Ϊ������ֵ
        public IsTriangleTest(boolean expected, int lborderA, int lborderB, int lborderC) {
            this.expected = expected;
            this.lborderA = lborderA;
            this.lborderB = lborderB;
            this.lborderC = lborderC;
        }
        
        //����isTriangle()�����Ĳ����������ݼ�
        @Parameters
        public static Collection<Object[]> testData() throws IOException {
            Object[][] obj = {{ false , 0, 1, 1 }, 
                              { false , 2, 0, 0 },
                              { false , 2, 3, 0 },
                              { false , 3, 1, 1 },
                              { false , 1, 3, 1 },
                              { false , 2, 1, 3 },
                              { true , 3, 4, 5 }};
            return Arrays.asList (obj);    
        }
        
        //isTriangle()�Ĳ��Է���
        @Test
        public void testIsTriangle() {
            //ʵ������������Triangle
            Triangle triangle = new Triangle(this.lborderA, this.lborderB, this.lborderC);
            //���Բ���������Ԥ�ڽ����ʵ�ʽ���Ƿ�һ��
            Assert.assertEquals(this.expected, triangle.isTriangle(triangle));
        }
        
    }
    
    
    //ָ��ʹ�ò�����������������
    @RunWith(Parameterized.class)
    //����isType()�����Ĳ�����
    public static class IsTypeTest{
            
        //�����������ڴ�Ų�������
        private String expected;
        private int lborderA;   
        private int lborderB; 
        private int lborderC;
            
        //Ϊ��������һ���������Ĺ������췽����Ϊ������ֵ
        public IsTypeTest(String expected, int lborderA, int lborderB, int lborderC) {
            this.expected = expected;
            this.lborderA = lborderA;
            this.lborderB = lborderB;
            this.lborderC = lborderC;
        }
        
        //����isType()�����Ĳ����������ݼ�
        @Parameters
        public static Collection<Object[]> testData() throws IOException {
            Object[][] obj = {{ "", 0 , 1, 0 },
                    { "�ȱ�������", 2, 2, 2 },
                    { "���ȱ�������", 3, 4, 5 },
                    { "����������", 3, 3, 2 },
                    { "����������", 2, 3, 3 },
                    { "����������", 3, 2, 3 }};
                return Arrays.asList (obj);    
            }
            
        //isType()�Ĳ��Է���
        @Test
        public void testIsType() {
            //ʵ������������Triangle
            Triangle triangle = new Triangle(this.lborderA, this.lborderB, this.lborderC);
            //���Բ���������Ԥ�ڽ����ʵ�ʽ���Ƿ�һ��
            Assert.assertEquals(this.expected, triangle.isType(triangle));
        }
            
    }
}
