package com.lanqiao.Demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTTest {
	ExceptionT exceptionT = new ExceptionT();
	
	/* 3. 使用 ExpectedException 规则进行异常测试 */
	@Rule
	public ExpectedException exceptedE =ExpectedException.none(); 
	
	@Test
	public void testDvision() {
		/* 1.    使用excepted异常测试：@Test(expected = AuthenticationException.class) */
//		exceptionT.division(5, 0);
		
		/* 2.      使用 try...catch 语句进行异常测试 */
//		try {
//			exceptionT.division(5, 1);
//            //如果未抛出异常则断言失败
//            fail("测试失败：未按预期抛出异常！");
//        }catch (ArithmeticException e) {
//            //断言抛出的异常类型是否为ArithmeticException
//            assertTrue(e instanceof ArithmeticException);
//            //断言异常的message属性中是否包含/ by zero
//            assertTrue(e.getMessage().contains("/ by zero"));
//        } 
		
		
		
		/* 3. 使用 ExpectedException 规则进行异常测试 */
		//断言抛出的异常类型是否为ArithmeticException
        exceptedE.expect(ArithmeticException.class);
        //断言异常的message属性内容
        exceptedE.expectMessage("/ by zero");
        exceptionT.division(5, 1);
		
	}

}
