package cn.lanqiao.cases;

import org.openqa.selenium.WebDriver;

public class UserInfoPage {

	   WebDriver driver;

	    public UserInfoPage(WebDriver driver){
	        this.driver = driver;
	    }
	    
	    //���һ����ȡ��ǰҳ�����ķ���
	    public String getPageTitle(){
	        return driver.getTitle();
	    }
}
