package cn.lanqiao;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class gsTest {

	WebDriver driver = null;
	
	//��ʼ��
	@Before
	public void setup() {
		//���û������
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		//���õȴ�ʱ��5s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//���ô��ڴ�С
		driver.manage().window().setSize(new Dimension(1500, 500));
				
		//��д������վ��ַ
		String urlString = "https://6655c0fd14120c2639839b6d.hz-iframe-svc.simplelab.cn/login";
		driver.get(urlString);
	}
	
	@Test
	public void test() throws InterruptedException {
		//������վ�������վ�����Ƿ�Ϊ����¼����ϵͳ��
		Assert.assertEquals("��¼����ϵͳ", driver.getTitle());
		//���������--�����˻������룬��֤��
			//�˻�
		WebElement username = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/input[1]"));
		username.clear();
		username.sendKeys("admin");
		Thread.sleep(500);
		
			//����
		WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/input[2]"));
		password.clear();
		password.sendKeys("admin123");
		Thread.sleep(500);
		
			//��֤��
		WebElement certifycode = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/div[1]/div[1]/input"));
		certifycode.clear();
		certifycode.sendKeys("666");
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		Thread.sleep(1000);
		
		
		//����ҳ�棬�����˺���֤
		Assert.assertEquals("���ų���", driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/ul/li[3]/a/span")).getText());;
		
		//���ϵͳ����--���Ź���
		driver.findElement(By.xpath("/html/body/div/nav/div[2]/div[1]/ul/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/nav/div[2]/div[1]/ul/li[3]/ul/li[4]/a")).click();
		
		//���ҡ�����������ɾ��
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")))
		.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[1]/input")).sendKeys("��");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[3]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/table/tbody/tr/td[6]/a[3]")).click();
		
		//������ã��������������ҵ���123����ɾ��
		
		WebElement delete = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/table/tbody/tr[12]/td[6]/a[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",delete);
		//��ȡ123���ı�
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/table/tbody/tr[14]/td[2]")).getText());
		delete.click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]")).getText());
		driver.findElement(By.className("layui-layer-btn0")).click();
		//??????????????????????????????????????????????????????????????????????????????????????????????????????
		
		//�˳�frameģʽ--���ȫ��
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"fullScreen\"]")).click();
		
		
	}
	
	@After
	public void end() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
