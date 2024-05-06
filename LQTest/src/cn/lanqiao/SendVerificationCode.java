package cn.lanqiao;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * 判断手机号码的合法性。规则如下： 
 *  1. 校验 phoneNumber 的长度是否合法； 
 *  2. 使用正则表达式校验 phoneNumber 是否符合通用手机号码的规则； 
 *  3. 如果 phoneNumber 的长度合法且符合通用手机号码规则返回 true ，否则返回 false。
 */

public class SendVerificationCode {	
	
	public boolean isValid(String phoneNumber) {
		String pattern = "^1[3-9]\\d{9}$";
//		if(phoneNumber != null && phoneNumber.length() == 0) System.out.println("kong");
		if (phoneNumber == null || phoneNumber.length() == 0 || phoneNumber.length() != 11) {
			return false;
		} else if (!phoneNumber.matches(pattern)) {
			return false;
		} else {
			return true;
		}
	}

}