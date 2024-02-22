package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.genericlibrary.BaseTest;

public class RegisterPage extends BasePage {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="gender-female")
	WebElement femaleradiobutton;
	
	public void clickfemaleradiobutton() {
		femaleradiobutton.click();
		
	}
	@FindBy(id="gender-male")
	private WebElement maleradiobutton;
	
	public void clickmaleradiobutton() {
		maleradiobutton.click();
	}
	@FindBy(id="FirstName")
	private WebElement firstnametextfield;
	
	public void enterFirstName(String firstname) {
		firstnametextfield.sendKeys(firstname);
	}
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	
	public void enterLastName(String lastname) {
		lastnametextfield.sendKeys(lastname);
	}
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	public void enterEmail(String email) {
		emailtextfield.sendKeys(email);
	}
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	public void enterPassword(String password) {
		passwordtextfield.sendKeys(password);
	}
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordtextfield;
	
	public void enterConfirmPassword(String password) {
		confirmpasswordtextfield.sendKeys(password);
	}
	
	@FindBy(id="register-button")
	private WebElement registerbutton;
	
	public void clickRegisterButton() {
		registerbutton.click();
	}	
	
		
	}
		

	
	
	


