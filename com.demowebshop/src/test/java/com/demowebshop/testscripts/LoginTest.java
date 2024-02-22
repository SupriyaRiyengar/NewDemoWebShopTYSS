package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.LoginPage;
import com.demowebshop.pomRepository.WelcomePage;


public class LoginTest extends BaseTest{
	
	@Test(dataProvider = "loginData")
	public void TCLogin001(String email, String password) throws InterruptedException {
		WelcomePage welcomePage= new WelcomePage(driver);
		welcomePage.clickLogin();
		
		LoginPage loginPage= new LoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.enterpassword(password);
		loginPage.clickLoginButton();
		
		HomePage homePage= new HomePage(driver);
		try {
			softassert.assertTrue(homePage.getlogOutLink().isDisplayed());
		}catch(Exception e) {
			e.printStackTrace();
			Reporter.log("User not logged in");
		}
	}
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws EncryptedDocumentException, IOException {
		return ExcelRead.multipleRead("Login");
		
	}
		
}


