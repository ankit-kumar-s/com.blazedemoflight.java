package blazedemo_pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.blazedemo.java.blazedemo_baseclass;

public class blazedemo_flightdetailPage extends blazedemo_baseclass {
	
	
	public blazedemo_flightdetailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//tbody/tr/td[6]") List<WebElement> pricecoloumn;
	@FindBy(xpath="//tbody/tr/td[1]") List<WebElement> rows;
	int row = rows.size();
	
	public void chooselowestflight() {
		List<String> lowestprice = new ArrayList<String>();
		for(WebElement price : pricecoloumn) {
			  lowestprice.add(price.getText());
		}
		Collections.sort(lowestprice);
		String lowp = lowestprice.get(0);
		for(int i=1 ; i<row; i++) {
		String findinglowestprice =	driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[6]")).getText();
		if(findinglowestprice.equals(lowp)) {
			driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).click();
			break;
		}
			
		}
		
	}

}
