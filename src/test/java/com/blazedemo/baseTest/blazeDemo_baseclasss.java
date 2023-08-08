package com.blazedemo.baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class blazeDemo_baseclasss {
	public static WebDriver driver;
	public FileInputStream fis;
	public Properties prop;

	@BeforeClass
	@Parameters("browser")
	public void setup(String browsername) {
		try {
			prop = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir") + "/Configuration/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass
	public void teardown() {
		driver.close();

	}

}
