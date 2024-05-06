package cn.lanqiao.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.java.swing.plaf.windows.resources.windows;


/**
 * Page3-������ҳ�桿
  * ��ʵ�ָ�ҳ�������� 5 �������Ĳ������룺
  *  
 * 1.�����+������Ԫ�ز�������
 * 2.�������롾��λ���ơ��ķ���
 * 3.�������롾��λ���롿�ķ���
 * 4.�������롾��ʾ˳�򡿵ķ���
 * 5.�����ȷ������ť�ķ���
 * 
 * ע��1����Ҫ��  Page ҳ�ķ�������д iframe ���л����롣
 * ע��2��ע�ⲻҪ�Ķ��Ѿ�д�õķ�������
 *
 */
public class AddPostPage {

    protected WebDriver driver;

    public AddPostPage(WebDriver driver){
        this.driver = driver;
    }

    
    public void clickAddButton(){
    	//TODO ��ʵ�ֵ����+������Ԫ�ز�������
    	WebElement addElement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div[1]/div/a[1]"));
    	addElement.click();
    }
    
    
    public void inputPostName(String postName)  {
    	//TODO ��ʵ�ֱ������롾��λ���ơ��ķ�����postName Ϊ����Ĳ���
    	//����������
    	WebElement gwname = driver.findElement(By.xpath("//*[@id=\"postName\"]"));
    	gwname.sendKeys(postName);
    }
    
    
    public void inputPostCode(String postCode) {
    	//TODO ��ʵ�ֱ������롾��λ���롿�ķ�����postCode Ϊ����Ĳ���
    	WebElement gwcode = driver.findElement(By.xpath("//*[@id=\"postCode\"]"));
    	gwcode.sendKeys(postCode);
    }
    
    
    public void inputPostSort(String postSort) {
    	//TODO ��ʵ�ֱ������롾��ʾ˳�򡿵ķ�����postSort Ϊ����Ĳ���
    	driver.findElement(By.xpath("//*[@id=\"postSort\"]")).sendKeys(postSort);
    	
    }
    
    
    public void clickOkButton() {
    	//TODO ��ʵ�ֵ����ȷ������ť�ķ���
    	driver.findElement(By.xpath("/html/body/div[4]/div[3]/a[1]")).click();
//    	/html/body/div[3]/div[3]/a[1]
//    	/html/body/div[3]/div[3]/a[1]
    	
    }

}
