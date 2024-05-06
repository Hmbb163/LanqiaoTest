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


//指定测试类的运行方式
@RunWith(Enclosed.class)
public class TriangleTest {
    
    //指定使用参数化运行器来运行
    @RunWith(Parameterized.class)
    //测试isTriangle()方法的测试类
    public static class IsTriangleTest{
        
        //声明变量用于存放测试数据
        private boolean expected;
        private int lborderA;   
        private int lborderB; 
        private int lborderC;
        
        //为测试类声明一个带参数的公共构造方法，为变量赋值
        public IsTriangleTest(boolean expected, int lborderA, int lborderB, int lborderC) {
            this.expected = expected;
            this.lborderA = lborderA;
            this.lborderB = lborderB;
            this.lborderC = lborderC;
        }
        
        //返回isTriangle()方法的测试用例数据集
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
        
        //isTriangle()的测试方法
        @Test
        public void testIsTriangle() {
            //实例化被测试类Triangle
            Triangle triangle = new Triangle(this.lborderA, this.lborderB, this.lborderC);
            //断言测试用例的预期结果与实际结果是否一致
            Assert.assertEquals(this.expected, triangle.isTriangle(triangle));
        }
        
    }
    
    
    //指定使用参数化运行器来运行
    @RunWith(Parameterized.class)
    //测试isType()方法的测试类
    public static class IsTypeTest{
            
        //声明变量用于存放测试数据
        private String expected;
        private int lborderA;   
        private int lborderB; 
        private int lborderC;
            
        //为测试声明一个带参数的公共构造方法，为变量赋值
        public IsTypeTest(String expected, int lborderA, int lborderB, int lborderC) {
            this.expected = expected;
            this.lborderA = lborderA;
            this.lborderB = lborderB;
            this.lborderC = lborderC;
        }
        
        //返回isType()方法的测试用例数据集
        @Parameters
        public static Collection<Object[]> testData() throws IOException {
            Object[][] obj = {{ "", 0 , 1, 0 },
                    { "等边三角形", 2, 2, 2 },
                    { "不等边三角形", 3, 4, 5 },
                    { "等腰三角形", 3, 3, 2 },
                    { "等腰三角形", 2, 3, 3 },
                    { "等腰三角形", 3, 2, 3 }};
                return Arrays.asList (obj);    
            }
            
        //isType()的测试方法
        @Test
        public void testIsType() {
            //实例化被测试类Triangle
            Triangle triangle = new Triangle(this.lborderA, this.lborderB, this.lborderC);
            //断言测试用例的预期结果与实际结果是否一致
            Assert.assertEquals(this.expected, triangle.isType(triangle));
        }
            
    }
}
