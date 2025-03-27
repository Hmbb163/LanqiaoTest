package cn.lanqiao;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//
public class test {

	WebDriver driver = null;
	
	@Before
	public void open() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
//		String urlString = "https://www.baidu.cn/";//lanqiao
//		String urlString = "https://www.lanqiao.cn/";
//		String urlString = "http://sahitest.com/demo/dragDropMooTools.htm";//��ק
//		String urlString = "http://sahitest.com/demo/iframesTest.htm";//irame
//		String urlString = "http://sahitest.com/demo/confirmTest.htm";//ȷ�ϲ���
//		String urlString = "http://sahitest.com/demo/clicks.htm";//���
//		String urlString = "http://sahitest.com/demo/php/fileUpload.htm";//�ļ��ϴ�
//		String urlString = "https://jqueryui.com/checkboxradio/";//��ѡ��
//		String urlString = "https://jqueryui.com/selectmenu/";//������--�˵�
		String urlString = "http://sahitest.com/demo/selectTest.htm";
		driver.get(urlString);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//3�뱨��
//		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(900, 500));
	}	
	
	@Test//form��ʽ�µ��ύ
//	@Ignore
	public void test10() throws InterruptedException {
		// ��λ�����ƿ���ҳ��input�����
        WebElement input = driver.findElement(By.cssSelector("#kw"));
        // ���� Selenium �ַ���
        input.sendKeys("Selenium");
        Thread.sleep(1000);
        // �ύ
        	//��һ:	
//        input.submit();
        	//����:
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
	}
	
	
	@Test//����Ԫ�ؿɵ������չʾ����ѡ��
	@Ignore
	public void test09() {
		System.out.println("dbl click me:"+driver.findElement(By.cssSelector("body > form > div:nth-child(7)")).isEnabled());
		System.out.println("dbl click me:"+driver.findElement(By.cssSelector("body > form > div:nth-child(7)")).isDisplayed());
		System.out.println("dbl click me:"+driver.findElement(By.cssSelector("body > form > div:nth-child(7)")).isSelected());
		System.out.println("double_button:"+driver.findElement(By.cssSelector("body > form > input[type=button]:nth-child(8)")).isSelected());
		System.out.println("��ѡ��"+driver.findElement(By.cssSelector("body > form > input[type=radio]:nth-child(23)")).isSelected());
	}
	
	@Test//�ϴ��ļ��¼�
	@Ignore
	public void test02() throws InterruptedException {
		driver.findElement(By.cssSelector("#file")).sendKeys("E:\\eclipseWorkspace\\LQTest\\pic1.png");;
		Thread.sleep(100000);
	}
	
	
	@Test//�������¼�
	@Ignore
	public void test7() throws InterruptedException {
		driver.findElement(By.cssSelector("#kw")).sendKeys("����");
		driver.findElement(By.cssSelector("#su")).click();
		Thread.sleep(1000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		String jsString = "window.scrollTo(0,document.body.scrollHeight);";
		String jsString = "window.scrollBy(50,1500);";
		jsExecutor.executeScript(jsString);
		Thread.sleep(1000);
//		jsExecutor.executeScript("arguments[0].scrollToView(true)",	);
	}
	
	@Test//�����л�
	@Ignore
	public void test08() throws InterruptedException {
		Thread.sleep(1000);
//		driver.get("http://sahitest.com/demo/php/fileUpload.htm");//ͬһ��ҳ����ת
		driver.navigate().to("http://sahitest.com/demo/php/fileUpload.htm");//ͬһ��ҳ����ת
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
	}
	
	@Test//����������л�--���
	@Ignore
	public void test06() {
		//��ȡdriver���
		String baiduString = driver.getWindowHandle();
		//��������ҳ��
		driver.findElement(By.cssSelector("#kw")).sendKeys("����");
		driver.findElement(By.cssSelector("#su")).click();
		driver.findElement(By.cssSelector("._paragraph_lzhxo_2 > span:nth-child(1) > span:nth-child(1) > em:nth-child(1)")).click();;
		///��ȡȫ�����
		Set<String> handleSet = driver.getWindowHandles();
		//���бȽϣ���ֵ
		String lanqString = null;
		for (String hanString:handleSet) {
			if(!hanString.equalsIgnoreCase(baiduString)) {
				lanqString = hanString;
				driver.switchTo().window(hanString);
				System.out.println(lanqString);
				System.out.println(hanString);
			}
		}
		System.out.println(baiduString);
	}
	
	@Test//ȫ����ͼ
	@Ignore
	public void test07() throws IOException {
		File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("./pic2.png"));
	}
	
	
	@Test//Ԫ�ؽ�ͼ����
	@Ignore
	public void test05() throws IOException {
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement pic = driver.findElement(By.cssSelector(".demo > form:nth-child(1) > fieldset:nth-child(1) > label:nth-child(1)"));
		//��Ԫ�ؽ�ͼ--��Ϊ������ļ�pic1
		File pic1 = pic.getScreenshotAs(OutputType.FILE);
		//��pic1�ļ������Ƶ�һ���µ��ļ�--ת��ΪͼƬ��ʽ
		FileUtils.copyFile(pic1, new File("./pic1.png"));
//		TakesScreenshot picScreenshot = new 
	}
	
	@Test//Select�������¼�---�ŵ�List<WebElement>����
	@Ignore
	public void test04() {
//		WebElement xlkElement = driver.findElement(By.id("speed"));
		WebElement xlkElement = driver.findElement(By.cssSelector("#s3Id"));
		Select select = new Select(xlkElement);
		List<WebElement> xlkElements = select.getOptions();
		for (WebElement webElement : xlkElements) {
			System.out.println(webElement.getText());
		}
		select.selectByIndex(1);
		for (WebElement webElement : xlkElements) {
			System.out.println(webElement.isSelected());
		}
//		driver.findElement(By.cssSelector("#ui-id-1")).click();;
	}
	

	
	@Test//��ѡ�¼�--List<WebElement>
//	@Ignore
	public void test03() throws InterruptedException {
		//��ȡ��ѡ���б�
		//��λԪ��
		WebElement selecElement = driver.findElement(By.cssSelector("#s4Id"));
		Select select = new Select(selecElement);
		//��select��ǩ����list��
		List<WebElement> list = select.getOptions();
		//ѭ������
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i).getText());
		}
//		Thread.sleep(5000);
		
		
		//��ѡ
//		select.selectByIndex(0);
//		select.selectByIndex(1);
//		//չʾԪ���Ƿ���ѡ
//		for (WebElement webElement : list) {
//			System.out.println(webElement.isSelected());
//		}
		
		
		//���̶�ѡ
		WebElement src = driver.findElement(By.cssSelector("#s4Id > option:nth-child(1)"));
		WebElement dest =driver.findElement(By.cssSelector("#s4Id > option:nth-child(6)"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(src).click(dest).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
		
		List<WebElement> selectedElements = select.getAllSelectedOptions();
		for (WebElement webElement : selectedElements) {
			System.out.println(webElement.getText());
		}
	}
	
	
	@Test//��ѡ�¼�
	@Ignore
	public void test8() throws InterruptedException {
		driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(23)")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(22)")).click();;
		Thread.sleep(500);
		driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(21)")).click();;
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".checkbox > input:nth-child(1)")).click();
		Thread.sleep(500);
		WebElement dblElement = driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(8)"));
		WebElement clickElement = driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(10)"));
		WebElement rightElement = driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(13)"));
		Actions actions = new Actions(driver);
		//���dblһ��
		actions.moveToElement(dblElement).click().perform();
		Thread.sleep(1000);
		//˫��dblһ��
		actions.moveToElement(dblElement).doubleClick().perform();
		Thread.sleep(1000);
		//���clickһ��
		actions.moveToElement(clickElement).click().perform();;
		Thread.sleep(1000);
		//˫��һ��
		actions.moveToElement(clickElement).doubleClick().perform();;
		Thread.sleep(1000);
		//���rightһ��
		actions.moveToElement(rightElement).click().perform();;
		Thread.sleep(1000);
		//�һ�һ��
		actions.moveToElement(rightElement).contextClick().perform();;
		Thread.sleep(1000);
		//˫��һ��
		actions.moveToElement(rightElement).doubleClick().perform();;
		Thread.sleep(1000);
		
		//clear��� 
		driver.findElement(By.cssSelector("body > form:nth-child(1) > input:nth-child(3)")).click();
		
		Thread.sleep(500);
//		Thread.sleep(500);
	}
	
	
	@Test//������--ȷ��orȡ���¼�
	@Ignore
	public void test001() {
		WebElement confirmElement = driver.findElement(By.name("b1"));
		confirmElement.click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	}
	
	
	@Test//�ȴ��¼�
	@Ignore
	public void test9() throws InterruptedException {
		driver.findElement(By.cssSelector("#kw")).sendKeys("����");
		driver.findElement(By.cssSelector("#su")).click();
		//��ʽ�ȴ�--�Ҳ�����һֱ��,ֱ��ʱ�䵽��,�����������˳�
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		try {
//			System.out.println(System.currentTimeMillis());
//			driver.findElement(By.cssSelector("#kw")).sendKeys("����");
//			driver.findElement(By.cssSelector("#su")).click();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(System.currentTimeMillis());
//		}
		//��ʽ�ȴ�--һֱ�ȴ���������,���˳�
//		WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(1))
//				.until(driver->driver.findElement(By.className("lb")));
		//ǿ�Ƶȴ�
		Thread.sleep(1000);
	}
	

	
	@Test //iframe�¼�
	@Ignore
	public void test6() throws InterruptedException {
		//��λiframe2
//		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/iframe")));//or1
//		driver.switchTo().frame(driver.findElement(By.cssSelector("#another > iframe:nth-child(1)")));//or2
		WebElement last = driver.findElement(By.cssSelector("body > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(28)"));

		last.click();
		Thread.sleep(1000);
		//�ص���ҳ��
		driver.switchTo().defaultContent();
		//�ٴζ�λ
		//��λiframe2
		driver.switchTo().frame(driver.findElement(By.cssSelector("body > iframe:nth-child(7)")));
		driver.findElement(By.cssSelector("body > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(28)")).click();
		
	}
	
	
	@Test//����¼�--��ק
	@Ignore
	public void test5() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement srcElement = driver.findElement(By.cssSelector("#dragger"));
		WebElement destElement = driver.findElement(By.cssSelector("div.item:nth-child(4)"));
		actions.clickAndHold(srcElement).moveToElement(destElement).release().perform();
		Thread.sleep(500);
	}
	
	@Test//����¼�--������/�һ�
	@Ignore
	public void test4() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement lanqbElement = driver.findElement(By.cssSelector("a.s-tab-item:nth-child(2)"));
		
//		actions.moveToElement(lanqbElement).contextClick().perform();
//		actions.moveToElement(lanqbElement).click().perform();
		Thread.sleep(1000);
	}
	
	
	@Test//����¼�--�����ͣ
	@Ignore
	public void test3() throws InterruptedException {
		//�������
		driver.findElement(By.cssSelector("#kw")).sendKeys("����");
		driver.findElement(By.cssSelector("#su")).click();
		Thread.sleep(500);
		Actions actions = new Actions(driver);
		WebElement lanqbElement = driver.findElement(By.cssSelector(".pf"));
		actions.moveToElement(lanqbElement).perform();
		Thread.sleep(1000);
	}
	

	@Test//���̼���
	@Ignore
	public void test2() throws InterruptedException {
		//�������
		driver.findElement(By.cssSelector("#kw")).sendKeys("����");
		driver.findElement(By.cssSelector("#su")).click();
		Thread.sleep(500);
		//ctrl + A 
		WebElement inputElement = driver.findElement(By.cssSelector("#kw"));
		inputElement.sendKeys(Keys.CONTROL,"A");
		Thread.sleep(1000);
		//ctrl + C
		inputElement.sendKeys(Keys.CONTROL,"X");
		Thread.sleep(1000);
		//ctrl + D
		inputElement.sendKeys(Keys.CONTROL,"V");
		Thread.sleep(1000);
	}
	
	
	@Test//������--���ײ�
	@Ignore
	public void test01() throws InterruptedException {
		//�������
		driver.findElement(By.cssSelector("#kw")).sendKeys("����");
		driver.findElement(By.cssSelector("#su")).click();
		Thread.sleep(500);
		//������--���ײ�
		((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop=10000");
		
	}
	
	
	@After
	public void end() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
}
