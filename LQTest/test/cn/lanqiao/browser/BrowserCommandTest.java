package cn.lanqiao.browser;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class BrowserCommandTest {

   //�������
    @Test@Ignore
    public void testOpenBrowser() throws Exception{
        // ���� WebDriver ��·��
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // ��ʼ�� Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// ����һ�� url ����
        String url = "https://www.lanqiao.cn/";
        // ���� driver �� get ������ �����ƿι���
        driver.get(url);
    }
    
    //��ȡ��ǰҳ��ı���
    @Test@Ignore
    public void testGetPageTitle() throws Exception{

        // ���� WebDriver ��·��
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // ��ʼ�� Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// ����һ�� url ����
        String url = "https://www.lanqiao.cn/";
        // ͨ�� title �������� driver �� getTitle �������ص�ֵ����������� Title
        driver.get(url);
        String title = driver.getTitle();
        // �ڿ���̨��� title
        System.out.println(title);
    }
    
    //��ȡ��ǰҳ��� URL ��ַ
    @Test@Ignore
    public void testGetPageUrl() throws Exception {
        // ���� WebDriver ��·��
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	// ��ʼ�� Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// ����һ�� url ����
        String url = "https://www.lanqiao.cn/";
        // ͨ�� currentUrl ���������� driver �� getCurrentUrl �������ص�ֵ
        driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        // ��� currentUrl ����������
        System.out.println(currentUrl);
    }
    
 
    //�ر������
    @Test@Ignore
    public void testCloseBrowser() throws Exception{
        // ���� WebDriver ��·��
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	// ��ʼ�� Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// ����һ�� url ����
        String url = "https://www.lanqiao.cn/";

        try {
            // ����������������ƿι���
            driver.get(url);
            // �ȴ��������� 3000ms = 3s
            Thread.sleep(3000);
            // �رյ�ǰ���������
            driver.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    //�˳������
    @Test@Ignore
    public void testQuitBrowser() throws Exception{
        // ���� WebDriver ��·��
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	// ��ʼ�� Chrome Driver
    	WebDriver driver = new FirefoxDriver();
    	// ����һ�� url ����
        String url = "https://www.lanqiao.cn/";

        try {
            // �������ƿι���
            driver.get(url);
            // ���� 3000ms
            Thread.sleep(3000);
            // �˳���ǰ���������
            driver.quit();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //�����ҳ���л�����
    @Test
    public void testSwitchHandle() throws Exception{
        // ���� WebDriver ��·��
    	System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        // ����ٶ���ҳ
        driver.get("https://www.baidu.com/");
        System.out.println("baidu handle��"+driver.getWindowHandle());
        
      // �����ǰҳ��ı���
        System.out.println("1. "+driver.getTitle());//���ٶ�һ�£����֪����       
        // ������������ �����ƿ�
        driver.findElement(By.id("kw")).sendKeys("�����ƿ�");
        // ���������ƿ�
        driver.findElement(By.id("su")).click();
        Thread.sleep(1000);
        // �����һ�������ƿι���
        driver.findElement(By.partialLinkText("�����ƿ�")).click();  
      // �����ǰҳ��ı���
        System.out.println("2. "+driver.getTitle());//�������ƿ�_�ٶ�������
        // ��ȡ��ǰ���ڵľ��getWindowHandle
        String baiduWindow = driver.getWindowHandle();//���ٶȡ��ľ��
        
     // �����ǰҳ��ı���
        System.out.println("ʲôhandle��"+driver.getWindowHandle());//�������ƿ�_�ٶ�������
        
        // ����������������ƿι���ҳ��ľ��
        String lanqiaoWindow = null;
        //Set<String> windowHandles ����ΪwindowHandles���ַ�������[�����ظ�]
        //getWindowHandles���ڻ�ȡ���д򿪵Ĵ��ڻ��ǩҳ�ľ��
        Set<String> windowHandles = driver.getWindowHandles();
     // �����ǰҳ��ı���
        System.out.println("4. �ص㣡����--��"+driver.getTitle());
        
        // ѭ�����еľ��
        for (String windowHandle : windowHandles) {
            // �����ǰ������ǵ�һ���ٶȴ���--�������ƿ�_�ٶ��������ľ��
            if (!windowHandle.equalsIgnoreCase(baiduWindow)){
                // �ͽ�������ھ����ֵ�� lanqiaoWindow
                lanqiaoWindow = windowHandle;
                // �л��� lanqiaoWindow
                driver.switchTo().window(lanqiaoWindow);
            }
        }
        System.out.println("baidu handle:"+baiduWindow);
        System.out.println("lq handle:"+lanqiaoWindow);
        //���������л���lqwindow�ˣ�driver.switchTo().window(lanqiaoWindow);
        //�������ڵľ����lq��
        System.out.println("ʲôhandle��"+driver.getWindowHandle());
        Thread.sleep(1000);

        // ��������ƿ�ҳ��ı���
        
        System.out.println("5. �ص㣡����--��"+driver.getTitle());
        driver.quit();
    }
    
}