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
 * UserService测试类
 */
// TODO 填写顺序执行的代码
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按照名字的顺序执行
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
    	// TODO: 请填写test1Login方法的单元测试代码
		Assert.assertEquals(true, pUserService.login("user1", "password1"));
		Assert.assertEquals(false, pUserService.login("user3", "password1"));
		Assert.assertEquals(false, pUserService.login("user1", "password2"));
    }

	
   @Test
    public void test2UpdatePassword(){
    	// TODO: 请填写updatePassword方法的单元测试代码
	   //先登录
	   pUserService.login("user1", "password1");
	   
	   //该用户不存在--返回空
	   Assert.assertNull(pUserService.updatePassword("none", "password1"));
	   
	   Assert.assertEquals("password12",pUserService.updatePassword("user1", "password12").getPassword() );
    }
   
   
   @Test(expected = IllegalArgumentException.class)// TODO 请补充正确的代码
   public void test3UpdatePasswordException(){
	   // TODO: 请填写updatePassword方法的单元测试异常代码
	   
	   pUserService.updatePassword(null, "password11");
//	   Assert.assertEquals("参数错误", pUserService.updatePassword("user1", null));
	   pUserService.updatePassword("user1", null);
	   pUserService.updatePassword(null, null);
//	   Assert.assertEquals("参数错误", pUserService.updatePassword("user2", "password22"));
	   pUserService.updatePassword("user2", "password22");
   }
}
