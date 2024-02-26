package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.BooksPage;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.LoginPage;
import com.demowebshop.pomRepository.ShoppingCartPage;
import com.demowebshop.pomRepository.WelcomePage;

public class AddToCartTest extends BaseTest {
@Test(dataProvider="addToCart")
	public void TCShoppingCart001(String email, String password) {

		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.clickLogin();
		test.log(Status.INFO,"Login page is displayed");
	

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmail(email);
		loginpage.enterpassword(password);
		loginpage.clickLoginButton();
		HomePage homepage = new HomePage(driver);
		try {
		softassert.assertTrue(homepage.getlogOutLink().isDisplayed());
		if(homepage.getlogOutLink().isDisplayed()) {
			test.log(Status.PASS,"User is successfully logged in");
			welcomepage.clickheaderBooksLink();
			
			BooksPage bookspage= new BooksPage(driver);
		bookspage.addToCart();
		bookspage.addToCart();
		
		ShoppingCartPage shoppingCartPage= new ShoppingCartPage(driver);
		shoppingCartPage.clickShoppingCart();
	   softassert.assertTrue(shoppingCartPage.firstProductName()
				.contains("Computing and Internet"));
	   test.log(Status.PASS,"Product id added to cart");
			}
		}
		catch (Exception e) {
		            e.printStackTrace();
		            test.log(Status.FAIL, "User is not logged in and product is not added to the cart");
		            		Reporter.log("User not logged in");
		}
    }
@DataProvider(name="addToCart")
		public String[][] addToCartDataProvider() throws EncryptedDocumentException, IOException{
			return ExcelRead.multipleRead("AddToCart");
		}
	
		
	
		
	}

