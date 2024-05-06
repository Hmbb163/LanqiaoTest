package cn.lanqiao.cases;

import org.openqa.selenium.WebDriver;

public class UserInfoPage {

	   WebDriver driver;

	    public UserInfoPage(WebDriver driver){
	        this.driver = driver;
	    }
	    
	    //添加一个获取当前页面标题的方法
	    public String getPageTitle(){
	        return driver.getTitle();
	    }
}
