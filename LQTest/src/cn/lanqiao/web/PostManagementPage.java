package cn.lanqiao.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.java.swing.plaf.windows.resources.windows;

import javafx.scene.control.Alert;

/**
 * Page2-����λ����ҳ�桿
  * ��ʵ�ָ�ҳ�������� 7 �������Ĳ������루����Ԫ��λ�ÿɲ�����Ŀ��ͼ����
  *  
 * 1.��ȡ��¼��ġ����ų��ܡ��ı�ֵ
 * 2.�����ϵͳ���� > �������λ���� �Ĳ˵�·��
 * 3.��λ�������еġ���λ���롿����� �����������post_code
 * 4.�������������ť����
 * 5.��ȡ��������ġ���ҳ��ʾ��Ϣ�ı�ֵ��
 * 6.��������б�ɾ������ť
 * 7.�����ȷ�ϡ�ɾ���İ�ť
 * 
 *  ע��1����Ҫ��Pageҳ�ķ�������д iframe ���л�����
 *  ע��2��ע�ⲻҪ�Ķ��Ѿ�д�õķ�������
 *
 */
public class PostManagementPage{
    protected WebDriver driver;

    public PostManagementPage(WebDriver driver){
        this.driver = driver;
    }
    
   
	public String getUsernameText() {
		//ͨ��classname�ҵ������ų��ܡ�
		WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/ul/li[3]/a/span"));
		return webElement.getText();
		 //TODO ��ʵ�� ��ȡ�����ų��ܡ��Ĳ���������ע���ڴ˷�������ӷ���ֵ
	        
	}
    
    public void clickPostManagePath() throws InterruptedException{
    	//TODO ������ʵ�ֵ����ϵͳ���� > �������λ���� ��·����������
    	WebElement webElement = driver.findElement(By.xpath("/html/body/div/nav/div[2]/div[1]/ul/li[3]/a"));
    	webElement.click();
    	
    	//�ǵ���һ��������ʱ��
    	  Thread.sleep(1000);
    	WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/div[1]/ul/li[3]/ul/li[5]/a"));
    	webElement2.click();
    	//
    	Thread.sleep(1000);
    }
    

    
    public void inputPostCodeSearch(String postCode) {
    	//TODO ��ʵ��������������λ���롿�����ķ�����post_code Ϊ�������
        WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[1]/input"));
        webElement.sendKeys(postCode);
    }
    
    
    public void clickSearchButton() {
    	//TODO ��ʵ�ֵ������������ť�ķ���
    	//-��������-
//    	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div/div[3]/iframe[2]")));
       WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div/ul/li[4]/a[1]"));
       webElement.click();
    }
    
    public String getPageNumberText() throws InterruptedException {
		//TODO ��ʵ�� ��ȡ����ҳ��ʾ��Ϣ�ı�ֵ���Ĳ���������ע���ڴ˷�������ӷ���ֵ
    	WebElement pageinfoElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[3]/div[1]/span"));
    	return pageinfoElement.getText();
	}
   
   public void clickDeleteButton() {
   	   //TODO ��ʵ�ֵ����ɾ������ť�ķ���
	 //-��������-
//   	   driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/iframe[2]")));
	   WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[8]/a[2]"));
       webElement.click();
   }

//-���󣡣���������-
   public void clickOkButton() {
   	   //TODO ��ʵ�ֵ����ȷ�ϡ�ɾ����ť�ķ���
	   driver.findElement(By.linkText("ȷ��")).click();
	  
   }
}
