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
 * �밴�ղ��������д��������
 * 
 * ����Ҫ��
 * 1.����ʹ��Ԫ�صȴ�ʱ�䡣
 * 2.����� Page ���еķ���ʵ�ֲ������衣
 * 3.����ʹ�� iframe �л���iframe �л��Ĵ�����д�ڴ��ļ��С�
 * 4.��Ҫ�Ķ��Ѿ�д�õķ�������
 */
public class WebCaseTest1 {
        
    WebDriver driver = null;
   
   //�������ʼ��
   @Before
   public void setUp() {
       //��Ҫ�Ķ��˴� driver λ��
       System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
       
       FirefoxOptions options = new FirefoxOptions();
       options.addPreference("security.fileuri.strict_origin_policy", false);
       options.addPreference("security.fileuri.origin_policy", "*");
       
       driver = new FirefoxDriver(options);
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.manage().window().maximize();
       
       //TODO ����д����վ���ַ
       driver.get("https://66177b7fc078967d2a7f2568.hz-iframe-svc.simplelab.cn/login");

   }
   
   
   //���ڴ˷�������д��������
   @Test
   public void testCase() throws InterruptedException {
	   //���� LoginPage ����
	   LoginPage1 loginPage = new LoginPage1(driver);
	   
	   //���� UserManagePage ����
       UserManagePage userManagePage = new UserManagePage(driver);
	   
       //����AddUserPage����
       AddUserPage addUserPage = new AddUserPage(driver);
       
	   
       //TODO ���������3��ʵ���������еķ�����ɲ����������루�����������Ŀ�е��������������ͽ�ͼ��
       //�� 1 �������뱻��ϵͳ��ַ����鿴����ɹ��ı���ϵͳ��ַ��
       //�� 2 �����ڵ�¼ҳ�����΢����롾�û�����-->�����롾���롿-->�۵������¼����ť���е�¼������ͼ��ʾ��
       loginPage.inputLoginName("admin");
       loginPage.inputLoginPassword("admin123");
       Thread.sleep(500);
       loginPage.clickLoginButton();
       
       //������ԣ���¼�ɹ��������ʾ���û����Ƿ�Ϊ�����ų��ܡ����ж��ԣ�����ͼ��ʾ��
       Assert.assertEquals("���ų���", userManagePage.getUsernameText());
       
       //��iframe2��
       //���΢ٵ����ϵͳ����-->�ڵ�����û�����-->�۵���������û�����ť������ͼ��ʾ����ʾ��ע��˴� iframe ���л���
	   userManagePage.clickSystemMenu();
	   Thread.sleep(1000);
	   userManagePage.clickUserMenu();
	   Thread.sleep(1000);
	   //iframeת��
	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
	   userManagePage.clickAddUserButton();
	   Thread.sleep(500);
	   driver.switchTo().defaultContent();
	   Thread.sleep(1000);
	   
	   //��iframe65��
	   //�����û�ҳ�棬���΢����롾�û����ơ�-->�����롾��¼�˺š�-->�����롾��¼���롿-->�ܹ�ѡ����ɫ������ͨ��ɫ��-->�ݵ�������桿��ť������ͼ��ʾ��
	   //��λ��iframe��driver.switchTo().frame(driver.findElement(By.xpath("......")))
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
	   
	   //��iframe2��
	   //������ԣ������Ƿ���ӳɹ���ͨ����ͼ�Тٴ����ı����ݺ�Ԥ����ƥ�䡣
	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
	   Assert.assertEquals("��ʾ�� 1 ���� 3 ����¼���ܹ� 3 ����¼",userManagePage.getPageNumberText());
	   
	   //��iframe2��
	   //�� 7 ��������ͼ��ʾ����������������ղ�����ӵ��û��ڡ���¼���ơ����۵������������ť��
	   userManagePage.inputLoginName("adminin");
	   Thread.sleep(500);
	   userManagePage.clickSearchButton();
	   Thread.sleep(500);
	   
	   //�� 8 ����������ԣ�������������Ƿ���ȷ��ͨ����ͼ�Тٴ����ı����ݺ�Ԥ����ƥ�䡣
	   Assert.assertEquals("��ʾ�� 1 ���� 1 ����¼���ܹ� 1 ����¼", userManagePage.getPageNumberText());
	   Thread.sleep(500);
	   
	   //�� 9 ����������������û��б��У�ɾ���������ĸ�����Ϣ������������ݺ���Ģܡ�ɾ������ť������ͼ��ʾ��
	   userManagePage.clickdeleteUser();
	   Thread.sleep(500);
	   
	   //�� 10 ��������ݡ����á������������������������ͼ��ʾ��
	   userManagePage.clickResetButton();
	   Thread.sleep(500);
	   
	   //�� 11 ����������ԣ�������������Тٴ����ı����ݺ�Ԥ����ƥ�䡣
	   Assert.assertEquals("��ʾ�� 1 ���� 2 ����¼���ܹ� 2 ����¼", userManagePage.getPageNumberText());
	   Thread.sleep(500);
	   driver.switchTo().defaultContent();
	   
	   //��defaultContent��
	   //�� 12 ������������ų��ܡ�ͷ�񣬵�����˳���¼��������ͼ��ʾ��
	   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[3]/a/span")).click();
	   //���ε��֮����ò�Ҫ�м�������ܳ���չ�����б��С�eg�����ų���--�˳���
	   userManagePage.clickLoginOut();
   } 
   
   //������˳�
   @After
   public void tearDown() {
	   if(driver!=null)
		   driver.quit();
   }
    
}