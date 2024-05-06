package cn.lanqiao.elements;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocatorsTest {

//	--ʹ�� findElement �� findElements ����λ�ٶ���ҳ��Ԫ��--
	 @Test
	 @Ignore
	    public void testFindElement() throws Exception {
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ��λ�����������
	        WebElement element = driver.findElement(By.id("kw"));
	        // ���� selenium �ؼ���
	        element.sendKeys("selenium");
	        
	        // ��ȡҳ���� input ����б�--�ٶ�ҳ���input��
	        List<WebElement> elementList = driver.findElements(By.tagName("input"));
	        System.out.println(driver.getTitle());
	        
	        // ����б���input��ĸ���
	        System.out.println(elementList.size());

	        Thread.sleep(500);
	        driver.quit();
	    }
	 
//	 ͨ��id�ؼ��ֲ���
	 @Test@Ignore
	    public void testFindElementById() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ͨ�� id ��λ�����������
	        WebElement element = driver.findElement(By.id("kw"));
	        // ����������������� selenium �ؼ���
	        element.sendKeys("selenium");

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 --ͨ��Nameֵ��λ--
	 @Test@Ignore
	    public void testFindElementByName() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();

	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ͨ�� name ���Զ�λ�� ���������
	        WebElement element = driver.findElement(By.name("wd"));
	        // ����������������� name �ؼ���
	        element.sendKeys("name");

	        Thread.sleep(1000);
//	        driver.quit();
	    }
	 
//	 ͨ�����ֶ�λ
	 @Test@Ignore
	    public void testFindElementByLinkTextAndPartialLinkText() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ��λ�����ű�ǩ-------------------------------------
	        WebElement newsEle = driver.findElement(By.linkText("����"));
	        // ������ű�ǩ
	        newsEle.click();
	        // ����3s
	        Thread.sleep(3000);
	        // �ٴδ� �ٶ���ҳ-------------------------------------
	        driver.get(url);
	        // ��λ��ҳ�� hao123����ǩ����������������������������������������������
	        WebElement haoEle = driver.findElement(By.partialLinkText("hao"));
	        // ��� hao123 ��ǩ
	        haoEle.click();

	        // ���� 3s
	        Thread.sleep(3000);
	        driver.quit();
	    }
	 
//	 ͨ��class��λ
	 @Test@Ignore
	    public void testFindElementByClassName() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ͨ�� className ��λ�����������
	        WebElement sIpt = driver.findElement(By.className("s_ipt"));
	        // ���� selenium �ؼ���
	        sIpt.sendKeys("selenium");

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 ͨ��tag_name����λ----------------------------------���ᣡ������������������������������������������
	 @Test@Ignore
	    public void testFindElementByTagName() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ��λ�ٶ���ҳ�� input �б�ͨ�� tagName ��λ
	        List<WebElement> inputList = driver.findElements(By.tagName("input"));
	        // ѡ�� input �б��е�����Ϊ7Ҳ���ǵ�8��Ԫ�أ�Ҳ����ҳ��������
	        WebElement searchInput = inputList.get(7);
	        // �������������ؼ���
	        searchInput.sendKeys("selenium");
	        
	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 ʹ��xPath����λ
	 @Test@Ignore
	    public void testFindElementByAbsXpath() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ͨ�� chrom ��鹤�߻�ȡ���� xpath ���ʽ����λ input �����
//	        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div/form/span[1]/input"));
	        WebElement input = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
	        // input �����������ؼ���
	        input.sendKeys("selenium");

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 ͨ��Ԫ��������λ
	 @Test@Ignore
	    public void testFindElementByXpathIndex() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ͨ���������ʽ����λ���������
	        WebElement input = driver.findElement(By.xpath("//span/input[1]"));
	        input.sendKeys("selenium");
	    
	        Thread.sleep(1000);
	        driver.quit();
	    }
	 
//	 ͨ��css��λ
	 @Test
	 @Ignore
	    public void testFindByCssSelector() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.baidu.com/";

	        driver.get(url);
	        // ͨ������������ css selector ���ʽ��λ
	        WebElement input = driver.findElement(By.cssSelector("#kw"));
	        input.sendKeys("selenium");
	        
	        Thread.sleep(1000);
	        driver.quit();

	    }
}