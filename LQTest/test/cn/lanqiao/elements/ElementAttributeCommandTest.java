package cn.lanqiao.elements;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementAttributeCommandTest {

//	--��ȡԪ������
	@Test@Ignore
	public void testGetEleAttr() throws InterruptedException {
//		����webDriver��·��
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String url = "http://www.lanqiao.cn/";
		driver.get(url);
		Thread.sleep(1000);
		
//		��λ��¼��ť
		WebElement sigin = driver.findElement(By.linkText("��¼"));
		// �����¼��ť��-�ı���Ϣ-���� div ��ǩ�м������
		System.out.println(sigin.getText());
        // �����¼��ť��-��ǩ��-
		System.out.println(sigin.getTagName());
        // �����¼��ť�� -class ���Ե�����ֵ-
		System.out.println(sigin.getAttribute("href"));
		
		Thread.sleep(1000);
		driver.quit();
	}
	
	
//	--��֤Is xxx ���� �Ƿ���ȷ
	 @Test
//	 @Ignore
	    public void testIs() throws Exception{
	        // ���� WebDriver ��·��
		 System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");	      
		 WebDriver driver = new FirefoxDriver();
	        String url = "https://www.lanqiao.cn/";
	        driver.get(url);

	        Thread.sleep(1000);
	        // ��λ�������ƿ���ҳ�����������-------------------------
	        WebElement input = driver.findElement(By.className("universal-header-search-input"));
	        // inputԪ���Ƿ�ɲ���-----------------isEnabled�����Ƿ���Ե����Ȳ���
	        System.out.println(input.isEnabled());
	        // inputԪ���Ƿ���ҳ��չʾ----------------isDisplayed�����ڽ����Ƿ�չʾ
	        System.out.println(input.isDisplayed());
	        // inputԪ���Ƿ�ѡ��---------isSelected���ڵ�ѡ����ѡ���С�false--���ǵ�ѡ����ѡ��
	        System.out.println(input.isSelected());

	        Thread.sleep(1000);
	        driver.quit();
	    }
	 

}
