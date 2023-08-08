package com.blazedemo.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class blazedemo_baseclass {
	
	public WebDriver driver;
	public blazedemo_baseclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
				
	}

}
