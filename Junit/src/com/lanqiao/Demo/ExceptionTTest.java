package com.lanqiao.Demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTTest {
	ExceptionT exceptionT = new ExceptionT();
	
	/* 3. ʹ�� ExpectedException ��������쳣���� */
	@Rule
	public ExpectedException exceptedE =ExpectedException.none(); 
	
	@Test
	public void testDvision() {
		/* 1.    ʹ��excepted�쳣���ԣ�@Test(expected = AuthenticationException.class) */
//		exceptionT.division(5, 0);
		
		/* 2.      ʹ�� try...catch �������쳣���� */
//		try {
//			exceptionT.division(5, 1);
//            //���δ�׳��쳣�����ʧ��
//            fail("����ʧ�ܣ�δ��Ԥ���׳��쳣��");
//        }catch (ArithmeticException e) {
//            //�����׳����쳣�����Ƿ�ΪArithmeticException
//            assertTrue(e instanceof ArithmeticException);
//            //�����쳣��message�������Ƿ����/ by zero
//            assertTrue(e.getMessage().contains("/ by zero"));
//        } 
		
		
		
		/* 3. ʹ�� ExpectedException ��������쳣���� */
		//�����׳����쳣�����Ƿ�ΪArithmeticException
        exceptedE.expect(ArithmeticException.class);
        //�����쳣��message��������
        exceptedE.expectMessage("/ by zero");
        exceptionT.division(5, 1);
		
	}

}
