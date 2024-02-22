package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.RegisterPage;
import com.demowebshop.pomRepository.WelcomePage;

public class RegisterTest extends BaseTest{
	
	@Test(dataProvider = "registerData")
	
	public void TCRegister001(String gender,String firstname,String lastname,String email,String password) {
		
		WelcomePage welcomePage= new WelcomePage(driver);
		welcomePage.clickOnRegister();
		RegisterPage registerPage= new RegisterPage(driver);
		if(gender.equalsIgnoreCase("F")) {
			registerPage.clickfemaleradiobutton();
		} 
		else if(gender.equalsIgnoreCase("M")) {
			registerPage.clickmaleradiobutton();
		} 
		else {
			Reporter.log("Gender is invalid", true);
		}
		registerPage.enterFirstName(firstname);
		registerPage.enterLastName(lastname);
		registerPage.enterEmail(email);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(password);
		registerPage.clickRegisterButton();
		
		HomePage homePage= new HomePage(driver);
		try {
			softassert.assertTrue(homePage.getlogOutLink().isDisplayed());
		}
		catch(Exception e) {
			e.printStackTrace();
			Reporter.log("User not registered");
		}
	}
	
	@DataProvider(name="registerData")
	public String[][]registerDataProvider() throws EncryptedDocumentException, IOException {
		return ExcelRead.multipleRead("Register");
		
	}
	

}
