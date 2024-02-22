package com.demowebshop.pomRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver){//constructor
		super(driver);
	}
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	public void clickLogin() {
		loginLink.click();
	}
	
	@FindBy(xpath="//a[@href=\"/register\"]")
	WebElement registerlink;
	
	public void clickOnRegister() {
		registerlink.click();
		
	}
	@FindBy(partialLinkText="BOOKS")
	WebElement headerBooksLink; 
		
		public void clickheaderBooksLink() {
			headerBooksLink.click();
		}
	
		
	}


