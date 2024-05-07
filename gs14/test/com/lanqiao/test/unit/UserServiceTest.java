package com.lanqiao.test.unit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runners.MethodSorters;

import com.lanqiao.User;
import com.lanqiao.UserService;

import org.junit.Assert;

/**
 * UserService������
 */
// TODO ��д˳��ִ�еĴ���
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//�������ֵ�˳��ִ��
public class UserServiceTest {
	
	static UserService pUserService;
	
	@BeforeClass
    public static void initUserServices(){
        pUserService = new UserService();
    }

    @AfterClass
    public static void destroyUserServices(){
        pUserService = null;
    }
	
	@Test
    public void test1Login() {
    	// TODO: ����дtest1Login�����ĵ�Ԫ���Դ���
		Assert.assertEquals(true, pUserService.login("user1", "password1"));
		Assert.assertEquals(false, pUserService.login("user3", "password1"));
		Assert.assertEquals(false, pUserService.login("user1", "password2"));
    }

	
   @Test
    public void test2UpdatePassword(){
    	// TODO: ����дupdatePassword�����ĵ�Ԫ���Դ���
	   //�ȵ�¼
	   pUserService.login("user1", "password1");
	   
	   //���û�������--���ؿ�
	   Assert.assertNull(pUserService.updatePassword("none", "password1"));
	   
	   Assert.assertEquals("password12",pUserService.updatePassword("user1", "password12").getPassword() );
    }
   
   
   @Test(expected = IllegalArgumentException.class)// TODO �벹����ȷ�Ĵ���
   public void test3UpdatePasswordException(){
	   // TODO: ����дupdatePassword�����ĵ�Ԫ�����쳣����
	   
	   pUserService.updatePassword(null, "password11");
//	   Assert.assertEquals("��������", pUserService.updatePassword("user1", null));
	   pUserService.updatePassword("user1", null);
	   pUserService.updatePassword(null, null);
//	   Assert.assertEquals("��������", pUserService.updatePassword("user2", "password22"));
	   pUserService.updatePassword("user2", "password22");
   }
}
