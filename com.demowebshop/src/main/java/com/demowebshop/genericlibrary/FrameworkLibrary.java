package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class FrameworkLibrary implements FrameworkConstants{
	
	public Actions action;
	public WebDriverWait wait;
	public SoftAssert softassert;
	public ExtentSparkReporter sparkReporter;
	public ExtentReports reports;
	public ExtentTest test;
	public String testMethodName;
	
	public void selectClas(WebElement dropdown,String option) {
		Select s= new Select(dropdown);
		int count=0;
		try {
			int indexValue=Integer.parseInt(option);
			s.selectByIndex(indexValue);
			count++;
		}catch(Exception e) {
			System.out.println("Not an index value");
		}
		if(count==0) {
			try {
				s.selectByValue(option);
			}
			catch(Exception e) {
				s.selectByVisibleText(option);
			}
		}
	}
	public void takeScreenShotOfPage(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File dest= new File("./Screenshots/"+name()+".png");
		File temp=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(temp, dest);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
		public void takeScreenshotOfElements(WebElement element) {
		
		    File temp=element.getScreenshotAs(OutputType.FILE);
		    File dest = new File(SCREENSHOT_PATH+name()+".png");
		   try {
			   FileHandler.copy(temp, dest);
	}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenshot(WebElement element) {
		
		File temp=element.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshot/Element"+datetime()+".png");
		try {
			FileHandler.copy(temp, dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	   public String name() {
		LocalDateTime dateTime=LocalDateTime.now();
		String filename=dateTime.toString().replaceAll(":", "-");
		return filename;
	}
		
	   public String datetime() {
		LocalDateTime dateTime=LocalDateTime.now();
		String filename=dateTime.toString().replaceAll(":", "-");
		return filename;
	}
	public String getPropertyValue(String key) throws IOException {
		File file= new File(PROPERTIES_PATH);
		FileInputStream fis= new FileInputStream(file);
		Properties p=new Properties();
		p.load(fis);
		return(p.getProperty(key));
	}
	public void initObjects(WebDriver driver) {
		action= new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		softassert = new SoftAssert();
	}
	public void ScrollactionTillWebElement(WebElement element) {
		action.scrollToElement(element).build();
	}

}

		
		
		
		
		
		
		
		
		
	
	
