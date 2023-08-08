package blazedemo_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.blazedemo.java.blazedemo_baseclass;

public class blzedemo_homePage extends blazedemo_baseclass{
	
	public blzedemo_homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//select[@name='fromPort']") WebElement depart_city;
	@FindBy(xpath="//select[@name='toPort']") WebElement destination_city;
	@FindBy(xpath="//input[@type='submit']")WebElement findflightbtn;
	@FindBy(xpath="//div[@class='container']/h3") WebElement flightinfo;
	
	public void setDepartureCity(String departcity) {
		depart_city.click();
		Select depcity = new Select(depart_city);
		depcity.selectByValue(departcity);
	}
	
	public void setDestinationCity(String destinationcity) {
		destination_city.click();
		Select descity = new Select(destination_city);
		descity.selectByVisibleText(destinationcity);
	}
	
	public void clickfinflightbtn() {
		findflightbtn.click();
	}
	
	public boolean flightdetailinfo() {
		try {
			return flightinfo.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
		
	}

}
