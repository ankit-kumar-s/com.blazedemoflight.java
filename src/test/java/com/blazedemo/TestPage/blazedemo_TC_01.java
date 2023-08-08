package com.blazedemo.TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazedemo.baseTest.blazeDemo_baseclasss;

import blazedemo_pageObjects.blzedemo_homePage;

public class blazedemo_TC_01 extends blazeDemo_baseclasss{
	
	@Test
	public void homepage() {
		
		blzedemo_homePage blhp = new blzedemo_homePage(driver);
		blhp.setDepartureCity(prop.getProperty("fromdecity"));
		blhp.setDestinationCity(prop.getProperty("todescity"));
		blhp.clickfinflightbtn();
		boolean textpresent = blhp.flightdetailinfo();
		Assert.assertEquals(textpresent, true);
		
	}

}
