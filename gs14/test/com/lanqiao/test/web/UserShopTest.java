package com.lanqiao.test.web;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

//�򵥵��û�����������
public class UserShopTest {

    static WebDriver driver = null;

    @Before
    public void setUp() {
        //TODO ����дchromedriver.exe��·��
        System.setProperty("webdriver.chrome.driver","");
        ChromeOptions options = new ChromeOptions();
        //ȡ��ɳ��ģʽ�������Ȩ�����У�����е�windowsϵͳ��ʱ���޷�����chrome������̨��ʾ500��error
        //options.addArguments("--no-sandbox");
        //ʹ�� chrome�����������ҳ��
        driver = new ChromeDriver(options);
        //������ʽ�ȴ�
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        
        //TODO ����д����վ���ַ
        driver.get("");

    }

    @After
    public void tearDown() {
        //TODO ����д������˳�
    }

    @Test
    public void testShop() throws InterruptedException {
        //TODO ����д��������
    }
}
