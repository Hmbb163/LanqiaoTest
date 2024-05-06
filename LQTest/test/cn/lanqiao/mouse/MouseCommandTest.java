package cn.lanqiao.mouse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;


public class MouseCommandTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		System.getProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();

	}
	
	//��ͣ����
	@Test@Ignore
	public void testMoveToElement() {
		driver.get("https://www.lanqiao.cn");
		//����������
		Actions actions = new Actions(driver);
		//����Ԫ�ؿ�
		WebElement coursElement = driver.findElement(By.partialLinkText("���ű�"));
		//moveToElement:�����ָ���ƶ���ָ������ҳԪ���ϣ���perform������ִ���������
		actions.moveToElement(coursElement).perform();	
	}
	
	//��ק����
	@Test@Ignore
	public void testDragElement() {
		driver.get("https://jqueryui.com/droppable/");
		//����������
		Actions actionsAction = new Actions(driver);
		//ת��ΪiFrame--�ҵ�iFrame�����--��������������ק
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//����Ԫ�ؿ�
		 WebElement srcElement = driver.findElement(By.id("draggable"));
		 WebElement destElement = driver.findElement(By.id("droppable"));
		 
		//ִ�ж���:�������--�϶�--����
		 actionsAction.dragAndDrop(srcElement, destElement).perform();
//		actionsAction.clickAndHold(srcElement).moveToElement(destElement).release().perform();
	}
	
	//��Ԫ���ϵ�ָ��λ��
	@Test@Ignore
	public void testDrageElementToPostion() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		//Actions
		Actions actions = new Actions(driver);
		//iFrame--������iFrame��Webelement
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Webelement
		WebElement srcElement = driver.findElement(By.id("draggable"));
		
		
		 // ������ק 100
        actions.dragAndDropBy(srcElement, 100, 0).perform();
        Thread.sleep(2000);

        // ������ק 100
        actions.dragAndDropBy(srcElement, 0, 100).perform();
        Thread.sleep(2000);
	}
	
	//���Ŵ������СԪ��
	@Test
	public void moveByOffsetmoveByOffset() throws InterruptedException {
		driver.get("https://jqueryui.com/resizable/");
		//Actions
		Actions actions = new Actions(driver);
		//iFrame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Webelement
		// /html/body/div/div[3]---�����½ǵ�С���
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]"));
		Thread.sleep(1000);
		//act
		actions.clickAndHold(element).moveByOffset(20, 20).perform();
		Thread.sleep(1000);
		actions.clickAndHold(element).moveByOffset(-20, -20).perform();
	}
	
	@AfterClass
	public static void endMain() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
