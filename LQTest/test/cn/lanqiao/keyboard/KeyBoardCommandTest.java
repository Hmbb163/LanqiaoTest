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
	
	//使用键盘的输入/删除/空格/ctrl+a/ctrl+x
	@Test@Ignore
	public void testKeyboard() throws InterruptedException {
		//Webelement
		WebElement element = driver.findElement(By.id("kw"));
		//act--input
		element.sendKeys("蓝桥云课");
		Thread.sleep(1000);
		//act--删除
		element.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		//act--空格
		element.sendKeys(Keys.SPACE);
//		element.sendKeys(Keys.NUMPAD2);
		Thread.sleep(1000);
		//act--ctrl+a
		element.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		//act--ctrl+x
		element.sendKeys(Keys.CONTROL,"x");
	}
	
	//键盘实现多选操作
	@Test
	public void testSelectable() {
		driver.get("https://jqueryui.com/selectable/");
		//iFrame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//将选项存入到List表中--定位到 第一个元素 的xpath
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
