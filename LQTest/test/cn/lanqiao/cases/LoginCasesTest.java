package cn.lanqiao.cases;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCasesTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://passport.lanqiao.cn/login");
	}
	
	//�����������Զ������˺ţ����룬�����¼����ȡҳ�����
	@Test@Ignore
	public void testLogin() throws InterruptedException {
		//��λ����һ�������
		List<WebElement> inputs = driver.findElements(By.className("ant-input"));
		// ��һ������򣬾����û�������������¼�û���
        inputs.get(0).sendKeys("17851935085");
        // �ڶ�������򣬾��������������������
        inputs.get(1).sendKeys("djxyxb06010508...");
        // ��λ����¼��ť���������¼
        driver.findElement(By.className("ant-btn-primary")).click();

        // ���� 2000ms
        Thread.sleep(1000);

        // ��ȡҳ�����
        String title = driver.getTitle();

        // ����ҳ������Ƿ�Ϊ �û���Ϣ
        Assert.assertEquals("�û���Ϣ", title);
	}
	
	@Test@Ignore
	public void testLogin1() throws InterruptedException {
		//��ʼ��ҳ�����
		LoginPage loginPage = new LoginPage(driver);
		UserInfoPage userInfoPage = new UserInfoPage(driver);
		//��¼
		loginPage.enterUsername("17851935085");
		loginPage.enterPassword("djxyxb06010508...");
		loginPage.clickLoginButton();
		//�ȴ�2s
		Thread.sleep(2000);
		//�ж�
		Assert.assertEquals("�û���Ϣ", userInfoPage.getPageTitle());
	}
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
