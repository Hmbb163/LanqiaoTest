package cn.lanqiao.web;



import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



/**
 * �밴�ղ��������д��������
 *
 * ����Ҫ��
 * 1.����ʹ��Ԫ�صȴ�ʱ��
 * 2.����� Page ���еķ���ʵ�ֲ�������
 * 3.����ʹ�� iframe �л���iframe �л��Ĵ�����д�ڴ��ļ���
 * 4.��Ҫ�Ķ��Ѿ�д�õķ�������//
 *
 */
public class WebCaseTest {
	WebDriver driver = null;

	// �������ʼ��
	@Before
	public void setUp() {
		//���û��·������Ҫ�Ķ��˴� driver λ��
		 System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	 
		// ����������
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("security.fileuri.strict_origin_policy", false);
		options.addPreference("security.fileuri.origin_policy", "*");

		driver = new FirefoxDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		//��д����վ���ַ
		driver.get("https://66174373c078967d2a7ef506.hz-iframe-svc.simplelab.cn/login");

	}
 
	
	// ���ٴ˷�������д������������
	@Test
	public void testBrowser() throws InterruptedException {
		//����LoginPage���󣬹����ø����еķ���ʵ�֡���¼���Ĳ�������
		LoginPage loginPage = new LoginPage(driver);
		
		//�����¼�˺�����������˻�-admin
		loginPage.inputLoginName("admin");

		//�����¼�����������������-LQ15Mock2@2004
		loginPage.inputLoginPassword("admin123");

		//�����֤�����������-666
		loginPage.inputCode("666");

		//�����¼��ť
		loginPage.clickLoginButton();
		
		//һ�����ҳ����ת����Ҫ�ӵȴ�ʱ��
		Thread.sleep(2000);
		
	
		// ����PostManagementPage����
		PostManagementPage postManagementPage = new PostManagementPage(driver);
		
		
		// ����PostManagementPage����
		AddPostPage addPostPage = new AddPostPage(driver);
		
		// TODO �������Ŀ�С��������衿��ȫ���´��룬���� 3 ��Page���еķ���ʵ�֡�
//		�� 3 ������¼�ɹ����� ����λ����ҳ�� PostManagementPage.java ������������²������룺
		assertEquals("���ų���",postManagementPage.getUsernameText());
		
		postManagementPage.clickPostManagePath();
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
		postManagementPage.inputPostCodeSearch("ceo");
		Thread.sleep(700);
		postManagementPage.clickSearchButton();
		Thread.sleep(500);
		assertEquals("��ʾ�� 1 ���� 1 ����¼���ܹ� 1 ����¼",postManagementPage.getPageNumberText());
		Thread.sleep(1000);
		postManagementPage.clickDeleteButton();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		postManagementPage.clickOkButton();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
		Thread.sleep(1000);
		addPostPage.clickAddButton();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"layui-layer-iframe3\"]")));
		addPostPage.inputPostName("���³�");
		Thread.sleep(500);
		addPostPage.inputPostCode("ceo");
		Thread.sleep(500);
		addPostPage.inputPostSort("1");
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		addPostPage.clickOkButton();
	}
	
	
	// ������˳�
	@After
	public void tearDown() {
		if(driver!=null)
			driver.quit();
	}


}