package cn.lanqiao.keyboard;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class KeyBoardCommandTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.baidu.com");
	}
	
	//ʹ�ü��̵�����/ɾ��/�ո�/ctrl+a/ctrl+x
	@Test@Ignore
	public void testKeyboard() throws InterruptedException {
		//Webelement
		WebElement element = driver.findElement(By.id("kw"));
		//act--input
		element.sendKeys("�����ƿ�");
		Thread.sleep(1000);
		//act--ɾ��
		element.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		//act--�ո�
		element.sendKeys(Keys.SPACE);
//		element.sendKeys(Keys.NUMPAD2);
		Thread.sleep(1000);
		//act--ctrl+a
		element.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		//act--ctrl+x
		element.sendKeys(Keys.CONTROL,"x");
	}
	
	//����ʵ�ֶ�ѡ����
	@Test
	public void testSelectable() {
		driver.get("https://jqueryui.com/selectable/");
		//iFrame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//��ѡ����뵽List����--��λ�� ��һ��Ԫ�� ��xpath
		List<WebElement> element = driver.findElements(By.xpath("//ol[@id='selectable']/*"));
		//Actions
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(element.get(0)).click(element.get(3)).keyUp(Keys.CONTROL).perform();
		}
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
