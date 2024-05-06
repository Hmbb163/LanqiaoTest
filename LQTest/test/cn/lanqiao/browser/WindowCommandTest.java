package cn.lanqiao.browser;




import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowCommandTest {

//	
	 @Test
	public void testWindow() throws Exception{
		// ���� WebDriver ��·��
	        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
	        // ��ʼ�� Chrome Driver
	        WebDriver driver = new FirefoxDriver();
	        String url = "https://www.lanqiao.cn/";
	        driver.get(url);
	        
	        // ��ȡ���ڵĴ�С
	        System.out.println("Ĭ�ϴ��ڴ�СΪ��"+driver.manage().window().getSize());

	        // ��ȡ���ڵ�λ��
	        
	        System.out.println("Ĭ�ϴ���λ�ã�" + driver.manage().window().getPosition());
	        
	        Thread.sleep(3000);
	        // �������
	        driver.manage().window().maximize();

	        // �ٴλ�ȡ���ڵĴ�С
	        System.out.println("������󻯺󴰿ڵĴ�СΪ��"+driver.manage().window().getSize());

	        Thread.sleep(3000);
	        // ȫ��
	        driver.manage().window().fullscreen();

	        Thread.sleep(3000);
	        // ���ô���Ϊָ����С
	        driver.manage().window().setSize(new Dimension(400, 200));
	        System.out.println("����ָ����СΪ��" + driver.manage().window().getSize());

	        Thread.sleep(3000);
	        // ���ô���λ��
	        driver.manage().window().setPosition(new Point(80, 100));
	   
	        
	        // ��ȡ���ڵ�λ��
	        System.out.println("���ú�Ĵ���λ�ã�" + driver.manage().window().getPosition());
	        driver.quit();
	    }
	 
}
