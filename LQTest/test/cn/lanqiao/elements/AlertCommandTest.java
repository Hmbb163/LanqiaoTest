package cn.lanqiao.elements;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertCommandTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(900, 800));
		driver.manage().window().setPosition(new Point(0, 0));
	}

	// alert����
	@Test
	@Ignore
	public void test1() throws InterruptedException {
		// ������վ
		String url = "file:///C:/driver/alert.html";
		driver.get(url);
		// ��λalert��ť
		WebElement alertElement = driver.findElement(By.xpath("/html/body/input[1]"));
		// ���alert��ť
		alertElement.click();
		// �л�����������󣬻�ȡ��������ı���Ϣ
		System.out.println(driver.switchTo().alert().getText());
		// ���ȷ��
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	// Confirm ������λ�����
	@Test
	@Ignore
	public void test2() throws InterruptedException {
		// ������վ
		String url = "file:///C:/driver/alert.html";
		driver.get(url);
		// ��λConfirm��ť
		WebElement confirmElement = driver.findElement(By.xpath("/html/body/input[2]"));
		// ���ҳ���еİ�ť
		confirmElement.click();
		// ��ȡ�������ı���Ϣ--���������Ϣ
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		// ����������ȷ�ϰ�ť--������İ�ť
		driver.switchTo().alert().accept();// ȷ�ϰ�ť

		// ���ҳ���еİ�ť
		confirmElement.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();// ȡ����ť

	}

	//prompt������Ķ�λ�����
	@Test
	@Ignore
	public void test3() throws InterruptedException {
		// ������վ
		String url = "file:///C:/driver/prompt.html";
		driver.get(url);	
		  //��λprompt��ť
		 WebElement promptElement = driver.findElement(By.xpath("/html/body/form/input[1]")); 
		 WebElement textElement = driver.findElement(By.xpath("/html/body/form/input[2]"));
		  //�����ť 
		 promptElement.click();
		Thread.sleep(1000);
		
		  //������������� 
		  System.out.println(driver.switchTo().alert().getText()); 
		  driver.switchTo().alert().sendKeys("�����ƿ�"); //input
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  //�ٿ����������� 
		  System.out.println(textElement.getText());
		 
	}

	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
