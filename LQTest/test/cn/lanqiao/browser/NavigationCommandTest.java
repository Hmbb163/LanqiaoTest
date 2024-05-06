package cn.lanqiao.browser;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommandTest {

//	--������ҳ--
    @Test@Ignore
    public void testNavigateTo() throws Exception {
        // ���� WebDriver ��·��
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // ��ʼ�� Chrome Driver
        WebDriver driver = new FirefoxDriver();

        // ���� URL ����
        String url = "https://www.lanqiao.cn/";

        // ���뵽ָ����ҳ����
        driver.navigate().to(url);
    }
    
//    --ǰ��+���˲���--
    @Test
    public void testNavigateBackOrForward() throws Exception{
        // ���� WebDriver ��·��
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // ��ʼ�� Chrome Driver
        WebDriver driver = new FirefoxDriver();
        
        // �������� url ��ַ����
        String url1 = "https://www.baidu.com/";
        String url2 = "https://www.lanqiao.cn/";

        // ���뵽�ٶ���ҳ------------------
        driver.get(url1);
        // ��ͣ2000ms
        Thread.sleep(1000);
        // �ڽ��뵽�����ƿι���----------------
        driver.navigate().to(url2);
        // ��ͣ 2000ms
        Thread.sleep(1000);
        // ���˵��ٶ���ҳ-----------------------
        driver.navigate().back();
        // ��ͣ 2000ms
        Thread.sleep(1000);
        // �ڽ��뵽�����ƿι���---------------------
        driver.navigate().forward();
        driver.navigate().refresh();//ˢ��
        Thread.sleep(1000);
        driver.quit();
    }
    
//    --ˢ��--
    @Test@Ignore
    public void testNavigateRefresh() throws Exception{
    	// ���� WebDriver ��·��
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        // ��ʼ�� Chrome Driver
        WebDriver driver = new FirefoxDriver();

        // ����һ�� url ����
        String url = "https://www.lanqiao.cn/";

        // �򿪰ٶ���ҳ
        driver.get(url);
        // ���� 3000ms
        Thread.sleep(3000);
        // ˢ��ҳ��
        driver.navigate().refresh();
    }
}