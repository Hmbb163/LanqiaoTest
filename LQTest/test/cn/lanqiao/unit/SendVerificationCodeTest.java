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
 * 单元测试
 * 1. 请使用 基本路径法 对被测源码 SendVerificationCode 类中的 isValid 方法设计单元测试用例。
 * 2. 请在下方 SendVerificationCodeTest 类中填写单元测试代码。
 * 3. 基本路径法：又称独立路径测试，是在程序控制流图的基础上，通过分析控制结构的环路复杂性，导出基本可执行路径集合，从而设计测试用例的方法。
 */
public class SendVerificationCodeTest {
	static SendVerificationCode sendCode;

	@Before
	public void initSendVerificationCodeTest() {
		sendCode = new SendVerificationCode();
	}

	
	  @Test @Ignore
	  public void tes() { 
		  // TODO: 请填写 isValid 方法的单元测试代码
		  
	  }
	 
	
	@Test
	public void testIsValid01() {
		// TODO: 请填写 isValid 方法的单元测试代码
		Assert.assertFalse(sendCode.isValid(null));
		
	}
	
	@Test
	public void testIsValid02() {
		// TODO: 请填写 isValid 方法的单元测试代码
		Assert.assertFalse(sendCode.isValid(""));
	}
	
	@Test
	public void testIsValid03() {
		// TODO: 请填写 isValid 方法的单元测试代码
		Assert.assertFalse(sendCode.isValid("123456"));
	}
	
	@Test
	public void testIsValid04() {
		// TODO: 请填写 isValid 方法的单元测试代码
		Assert.assertTrue(sendCode.isValid("17851935085"));
	}
	
	@Test
	public void testIsValid05() {
		// TODO: 请填写 isValid 方法的单元测试代码
		Assert.assertFalse(sendCode.isValid("189ajs2389a"));
	}

}