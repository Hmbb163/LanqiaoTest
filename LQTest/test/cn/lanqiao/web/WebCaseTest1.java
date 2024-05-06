package cn.lanqiao.web;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * 请按照操作步骤编写测试用例
 * 
 * 用例要求：
 * 1.合理使用元素等待时间。
 * 2.请调用 Page 类中的方法实现操作步骤。
 * 3.合理使用 iframe 切换，iframe 切换的代码填写在此文件中。
 * 4.不要改动已经写好的方法名。
 */
public class WebCaseTest1 {
        
    WebDriver driver = null;
   
   //浏览器初始化
   @Before
   public void setUp() {
       //不要改动此处 driver 位置
       System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
       
       FirefoxOptions options = new FirefoxOptions();
       options.addPreference("security.fileuri.strict_origin_policy", false);
       options.addPreference("security.fileuri.origin_policy", "*");
       
       driver = new FirefoxDriver(options);
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.manage().window().maximize();
       
       //TODO 请填写被测站点地址
       driver.get("https://66177b7fc078967d2a7f2568.hz-iframe-svc.simplelab.cn/login");

   }
   
   
   //请在此方法中续写测试用例
   @Test
   public void testCase() throws InterruptedException {
	   //创建 LoginPage 对象
	   LoginPage1 loginPage = new LoginPage1(driver);
	   
	   //创建 UserManagePage 对象
       UserManagePage userManagePage = new UserManagePage(driver);
	   
       //创建AddUserPage对象
       AddUserPage addUserPage = new AddUserPage(driver);
       
	   
       //TODO 请调用以上3个实例化对象中的方法完成测试用例代码（具体请参照题目中的用例步骤描述和截图）
       //第 1 步：输入被测系统网址，请查看部署成功的被测系统网址。
       //第 2 步：在登录页面依次①输入【用户名】-->②输入【密码】-->③点击【登录】按钮进行登录，如下图所示。
       loginPage.inputLoginName("admin");
       loginPage.inputLoginPassword("admin123");
       Thread.sleep(500);
       loginPage.clickLoginButton();
       
       //插入断言，登录成功后，请对显示的用户名是否为【蓝桥超管】进行断言，如下图所示。
       Assert.assertEquals("蓝桥超管", userManagePage.getUsernameText());
       
       //【iframe2】
       //依次①点击【系统管理】-->②点击【用户管理】-->③点击【新增用户】按钮，如下图所示。提示：注意此处 iframe 的切换。
	   userManagePage.clickSystemMenu();
	   Thread.sleep(1000);
	   userManagePage.clickUserMenu();
	   Thread.sleep(1000);
	   //iframe转换
	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
	   userManagePage.clickAddUserButton();
	   Thread.sleep(500);
	   driver.switchTo().defaultContent();
	   Thread.sleep(1000);
	   
	   //【iframe65】
	   //新增用户页面，依次①输入【用户名称】-->②输入【登录账号】-->③输入【登录密码】-->④勾选【角色】（普通角色）-->⑤点击【保存】按钮，如下图所示。
	   //定位到iframe：driver.switchTo().frame(driver.findElement(By.xpath("......")))
	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[3]")));
	   Thread.sleep(500);
	   addUserPage.inputUserName("adming");
	   Thread.sleep(500);
	   addUserPage.inputLoginName("adminin");
	   Thread.sleep(500);
	   addUserPage.inputLoginPassword("adminin");
	   Thread.sleep(500);
	   addUserPage.clickRole();
	   Thread.sleep(500);
	   addUserPage.clickSaveButton();
	   Thread.sleep(500);
	   driver.switchTo().defaultContent();
	   Thread.sleep(1000);
	   
	   //【iframe2】
	   //插入断言，断言是否添加成功，通过下图中①处中文本内容和预期相匹配。
	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
	   Assert.assertEquals("显示第 1 到第 3 条记录，总共 3 条记录",userManagePage.getPageNumberText());
	   
	   //【iframe2】
	   //第 7 步：如上图所示，在搜索框中输入刚才新添加的用户②【登录名称】，③点击【搜索】按钮。
	   userManagePage.inputLoginName("adminin");
	   Thread.sleep(500);
	   userManagePage.clickSearchButton();
	   Thread.sleep(500);
	   
	   //第 8 步：插入断言，断言搜索结果是否正确，通过上图中①处中文本内容和预期相匹配。
	   Assert.assertEquals("显示第 1 到第 1 条记录，总共 1 条记录", userManagePage.getPageNumberText());
	   Thread.sleep(500);
	   
	   //第 9 步：在搜索结果的用户列表中，删除搜索出的该条信息，点击该条数据后面的④【删除】按钮，如上图所示。
	   userManagePage.clickdeleteUser();
	   Thread.sleep(500);
	   
	   //第 10 步：点击⑤【重置】对搜索条件进行清除，如上图所示。
	   userManagePage.clickResetButton();
	   Thread.sleep(500);
	   
	   //第 11 步：插入断言，断言搜索结果中①处中文本内容和预期相匹配。
	   Assert.assertEquals("显示第 1 到第 2 条记录，总共 2 条记录", userManagePage.getPageNumberText());
	   Thread.sleep(500);
	   driver.switchTo().defaultContent();
	   
	   //【defaultContent】
	   //第 12 步：点击【蓝桥超管】头像，点击【退出登录】，如下图所示。
	   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a/span")).click();
	   //两次点击之间最好不要有间隔【不能持续展开的列表中。eg：蓝桥超管--退出】
	   userManagePage.clickLoginOut();
   } 
   
   //浏览器退出
   @After
   public void tearDown() {
	   if(driver!=null)
		   driver.quit();
   }
    
}