package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//li/a[@class=\"account\"])[1]")
	private WebElement loggedInEmailIDLink;
	
	public void clickEmailIDlink() {
		loggedInEmailIDLink.click();
	}
	public WebElement getloggedInEmailLink () {
		return loggedInEmailIDLink;
	}
	public void setLoggedInEmailIDLink(WebElement loggedInEmailIDLink) {
		this.loggedInEmailIDLink=loggedInEmailIDLink;
	}

	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutLink;
	
	public void clickLogoutLink() {
		 logoutLink.click();
		
	}
	public WebElement getlogOutLink () {
		return logoutLink;
	}
	public void setLogOutLink(WebElement logOutLink) {
		this.logoutLink=logOutLink;
	}
	
	
	
	
	
	
	

}
