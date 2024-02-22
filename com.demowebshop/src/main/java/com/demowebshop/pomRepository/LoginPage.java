package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="Email")
	WebElement emailtextfield;
	
	public void enterEmail(String email) {
		emailtextfield.sendKeys(email);
	}
	
	@FindBy(id="Password")
	WebElement passwordtextfield;
	
	 public void enterpassword(String password) {
			passwordtextfield.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@value=\"Log in\"]")
	WebElement loginbutton;
	
	public void clickLoginButton() {
		 loginbutton.click();
	}
	 
	
		}
	
		
	


