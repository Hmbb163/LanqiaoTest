package cn.lanqiao.elements;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementCommendsTest {

//	����ȫ�ֱ���
	public static WebDriver driver;
	
	@BeforeClass
	public static void setMain() {
		// ���� WebDriver ��·��
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
         driver = new FirefoxDriver();
         driver.manage().window().setSize(new Dimension(900, 800));
         driver.manage().window().setPosition(new Point(0, 0));
	}
	
//	 Click����
	 @Test@Ignore
	    public void testClick() throws Exception{
	        
	        String url = "https://www.lanqiao.cn/";

	        driver.get(url);

	        // ���� partialLinkText ��ȡ������������Ԫ��
	        WebElement discussLinkEle = driver.findElement(By.partialLinkText("����"));
	        
	        // ���������-----------------
	        discussLinkEle.click();

	        Thread.sleep(3000);
	        // ��󻯴��ڣ��õ�¼��ť�����ڴ�����
	        driver.manage().window().maximize();

	        // ���� linkText ��ȡ��¼��ť
	        WebElement loginBtnEle = driver.findElement(By.linkText("��¼"));
	        // �����¼��ť
	        loginBtnEle.click();

	        Thread.sleep(1000);
	    }
	 
//	 sendkeys �� clear ����
	 @Test@Ignore
	    public void testSendKeysAndClear() throws Exception{
		 
		 	//�򿪲�����վ
	        String url = "https://www.lanqiao.cn/";
	        driver.get(url);
	        
	        //��λ input �����
	        WebElement input = driver.findElement(By.tagName("input"));
	        
	        // ���� Selenium----------------------------------
	        input.sendKeys("Selenium");
	        Thread.sleep(3000);
	        
	        // ��������-------------------------------------
	        input.clear();
	        Thread.sleep(1000);
	    }

	 
//	 submit �ύ------ֻ������from�£������о�����
	 @Test
	 @Ignore
	    public void testSubmit() throws Exception{
		 
	        String url = "https://www.baidu.com/";
	        driver.get(url);

	        // ��λ�����ƿ���ҳ��input�����
	        WebElement input = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
	        // ���� Selenium �ַ���
	        input.sendKeys("Selenium");
	        Thread.sleep(1000);
	        // �ύ
	        	//��һ:	
	        input.submit();
	        	//����:
	        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();;
	        
	        Thread.sleep(1000);
	    }
	 
	 
//	 selectѡ��ѡ��
	 @Test
//	 @Ignore
	    public void testSelectEle() throws Exception{
	        // ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        String url = "http://sahitest.com/demo/selectTest.htm";

	        driver.get(url);

	        // ��λ����ѡ��
	        WebElement selectEle = driver.findElement(By.id("s1Id"));//xp://*[@id="s1Id"]
	        // ���� Select ��
	        Select select = new Select(selectEle);

	        // ��ȡ�õ�ѡ������е�ѡ��
//����Ҳ���ԣ�List<WebElement>opElements = new Select(selectEle).getOptions();
	        List<WebElement> options = select.getOptions();
	        // �����һ��ѡ����ı�����
	        System.out.println("get0: "+options.get(0).getText());

	        // ��ȡ�ѱ�ѡ���ѡ����Ϣ
	        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	        // ��ȡ��һ����ѡ���ѡ����ı���Ϣ
	        System.out.println("allselected: "+allSelectedOptions.get(0).getText());
	        // �����һ��ѡ���Ƿ�ѡ��
	        System.out.println("�Ƿ�ѡ��:" + allSelectedOptions.get(0).isSelected());
	        
	        // ��������ѡ��0��ʼ
	        select.selectByIndex(2);
	        Thread.sleep(1000);
	        // ���� value ����ֵѡ��
//	        select.selectByValue("two");
	        Thread.sleep(1000);
	        // ����ҳ����ʾ���ı�����ѡ��
//	        select.selectByVisibleText("Four");

	        Thread.sleep(1000);
	    }
	 
	 
//	 select��ѡ�����
	 @Test
	 @Ignore
	    public void test1() throws Exception{
		 
	        String path = "http://sahitest.com/demo/selectTest.htm";

	        driver.get(path);

	        Thread.sleep(1000);
	        //��λ����һ����ѡ��
			WebElement Select1Element=driver.findElement(By.id("s1Id"));
//			��WebElement����ת����Slect����
			Select select1=new Select(Select1Element);
//			ͨ���±�ѡ������ ѡ���±�Ϊ1��
			select1.selectByIndex(1);
			
//			��ȡ����ѡ��ѡ��
			List<WebElement> optionList=select1.getOptions();
//			�Ž�ȥ����ʵ��һ��WebElement����
			System.out.println("(�±�Ϊ1��)ѡ����"+optionList.get(1).getText());
			System.out.println("(�±�Ϊ1��)�Ƿ�ѡ��?="+optionList.get(1).isSelected());
			Thread.sleep(500);
			//�±�ѡ��Ϊ2��
			select1.selectByIndex(2);
			System.out.println("(2)text:"+optionList.get(2).getText());
			System.out.println("(2)tagn:"+optionList.get(2).getTagName());
			System.out.println("(2)is selected?--"+ optionList.get(2).isSelected());
			
			Thread.sleep(500);
			//��λ�����ڶ�����ѡ��
			WebElement Select2Element=driver.findElement(By.id("s2Id"));
//			��WebElement����ת����Slect����
			Select select2=new Select(Select2Element);

			Thread.sleep(500);
//			ѡ���ı�����
			select2.selectByVisibleText("o2");
//			��ȡ���п�ѡ��ѡ��
			List<WebElement> optionList2 = select2.getOptions();
			System.out.println("�ڶ�����ѡ��:ѡ�����02��--" + optionList2.get(2).getText());
			System.out.println("�ڶ�����ѡ��:02selected��--" + optionList2.get(2).isSelected());
			//ѡ�������±�
			select2.selectByIndex(1);
			System.out.println("�ڶ�����ѡ��ѡ�����o1��--" + optionList2.get(1).getText());
			System.out.println("�ڶ�����ѡ��(1)is selected��--" + optionList2.get(1).isSelected());
			
			/*
			 * Thread.sleep(500); //��λ���ĵ�������ѡ�� WebElement Select3Element =
			 * driver.findElement(By.id("s3Id")); // ��WebElement����ת����Slect���� Select
			 * select3=new Select(Select3Element); List<WebElement> optionList3 =
			 * select3.getOptions(); Thread.sleep(1000); // ѡ��
			 * select3.selectByValue("o2val"); System.out.println("��3����ѡ��(2)selected��--" +
			 * optionList3.get(2).isSelected()); Thread.sleep(1000);
			 * 
			 * select3.selectByVisibleText("o1"); System.out.println("��3����ѡ��(1)selected��--"
			 * + optionList3.get(1).isSelected()); Thread.sleep(1000);
			 * 
			 * select3.selectByValue("o3val"); System.out.println("��3����ѡ��(3)selected��--" +
			 * optionList3.get(3).isSelected()); Thread.sleep(1000);
			 * 
			 * System.out.println("window size:" + driver.manage().window().getSize() );
			 * System.out.println("window size:" + driver.manage().window().getPosition() );
			 */
			
	    }
	 
//	 select��ѡ�����
	 @Test
//	 @Ignore
	 public void test2() throws InterruptedException {
		 //������ַ
		 String url = "http://sahitest.com/demo/selectTest.htm";
		 driver.get(url);
		 
		 //ѡ����ĸ���ѡ��
		 WebElement webElement = driver.findElement(By.id("s4Id"));
		 //��webelement���� ת��Ϊ select����
		 Select select = new Select(webElement);
		 //��select�������뵽List����
//		 List<WebElement> options = select.getOptions();
		 //����ѡ��ѡ��
		 select.selectByIndex(1);
		 select.selectByIndex(2);
		 
		 List<WebElement> optionsSelected = select.getAllSelectedOptions();
		 int i = optionsSelected.size();
		 Thread.sleep(500);
		 System.out.println("first:"+select.getFirstSelectedOption().getText());
		 //ѭ��������ѡ���ѡ��
		 if(i>0) {
			 System.out.println("\"AllSelected:\"");
			 for(i=i-1;i>=0;i--) {
				 System.out.println(optionsSelected.get(i).getText());
				 
				 Thread.sleep(500);
			 }
		 }
		 
		 Thread.sleep(2000);
		 select.deselectAll();
//		 List<WebElement> optionsSelected1 = select.getAllSelectedOptions();
//		 System.out.println("outputAllSelected:" + optionsSelected1.get(1).getText());
		 
//		 System.out.println(options.get(1).getText() +"   "+ options.get(2).getText());
		 
	 }

	 
	 @AfterClass
	 public static void endMain() {
		 driver.quit(); 
	 }
}
