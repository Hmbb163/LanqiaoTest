package cn.lanqiao.unit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import cn.lanqiao.SendVerificationCode;

/**
 * ��Ԫ����
 * 1. ��ʹ�� ����·���� �Ա���Դ�� SendVerificationCode ���е� isValid ������Ƶ�Ԫ����������
 * 2. �����·� SendVerificationCodeTest ������д��Ԫ���Դ��롣
 * 3. ����·�������ֳƶ���·�����ԣ����ڳ��������ͼ�Ļ����ϣ�ͨ���������ƽṹ�Ļ�·�����ԣ�����������ִ��·�����ϣ��Ӷ���Ʋ��������ķ�����
 */
public class SendVerificationCodeTest {
	static SendVerificationCode sendCode;

	@Before
	public void initSendVerificationCodeTest() {
		sendCode = new SendVerificationCode();
	}

	
	  @Test @Ignore
	  public void tes() { 
		  // TODO: ����д isValid �����ĵ�Ԫ���Դ���
		  
	  }
	 
	
	@Test
	public void testIsValid01() {
		// TODO: ����д isValid �����ĵ�Ԫ���Դ���
		Assert.assertFalse(sendCode.isValid(null));
		
	}
	
	@Test
	public void testIsValid02() {
		// TODO: ����д isValid �����ĵ�Ԫ���Դ���
		Assert.assertFalse(sendCode.isValid(""));
	}
	
	@Test
	public void testIsValid03() {
		// TODO: ����д isValid �����ĵ�Ԫ���Դ���
		Assert.assertFalse(sendCode.isValid("123456"));
	}
	
	@Test
	public void testIsValid04() {
		// TODO: ����д isValid �����ĵ�Ԫ���Դ���
		Assert.assertTrue(sendCode.isValid("17851935085"));
	}
	
	@Test
	public void testIsValid05() {
		// TODO: ����д isValid �����ĵ�Ԫ���Դ���
		Assert.assertFalse(sendCode.isValid("189ajs2389a"));
	}

}