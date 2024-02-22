package com.demowebshop.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest extends FrameworkLibrary {
	public WebDriver driver;
	
	@BeforeSuite
	public void reportConfig() {
		sparkReporter= new ExtentSparkReporter(EXTENT_PATH + name());
		reports= new ExtentReports();
		reports.attachReporter(sparkReporter);
	}
	
	
	@BeforeClass
	public void browserSetup() throws IOException {
		if(getPropertyValue("browser").equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(getPropertyValue("browser").equals("firefox"))
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(getPropertyValue("url"));
		initObjects(driver);
	}
	@AfterClass
	public void afterClass() {
		System.out.println("browser closed");
		driver.quit();
		softassert.assertAll();
	}
	@AfterSuite
	public void reportFlush() {
		reports.flush();
		
	}

}
