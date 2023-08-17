package com.blazedemo.TestPage;

import org.testng.annotations.Test;

import com.blazedemo.baseTest.blazeDemo_baseclasss;

import blazedemo_pageObjects.blazedemo_flightdetailPage;
import blazedemo_pageObjects.blzedemo_homePage;

public class blazedemo_TC_02  extends blazeDemo_baseclasss{
	
	@Test 
	public void flightPriceScreen() {
		
		blzedemo_homePage blhp = new blzedemo_homePage(driver);
		blhp.setDepartureCity(prop.getProperty("fromdecity"));
		blhp.setDestinationCity(prop.getProperty("todescity"));
		blhp.clickfinflightbtn();
		
		blazedemo_flightdetailPage blfp = new blazedemo_flightdetailPage(driver);
		blfp.chooselowestflight();
		
	}

}
