package cn.lanqiao;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * �ж��ֻ�����ĺϷ��ԡ��������£� 
 *  1. У�� phoneNumber �ĳ����Ƿ�Ϸ��� 
 *  2. ʹ��������ʽУ�� phoneNumber �Ƿ����ͨ���ֻ�����Ĺ��� 
 *  3. ��� phoneNumber �ĳ��ȺϷ��ҷ���ͨ���ֻ�������򷵻� true �����򷵻� false��
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