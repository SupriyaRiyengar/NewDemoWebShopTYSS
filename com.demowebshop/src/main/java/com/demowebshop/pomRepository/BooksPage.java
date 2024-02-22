package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {

	public BooksPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement Books;
	
	
	@FindBy(xpath="//h2/a[text()='Computing and Internet']")
	private WebElement Computing;

    @FindBy(xpath="//input[@id=\"add-to-cart-button-13\"]")
   private WebElement AddToCart1;
    
    @FindBy(xpath="//a[text()='Fiction']")
   private WebElement Fiction;
    
    @FindBy(xpath="//input[@id=\"add-to-cart-button-45\"]")
    private WebElement AddToCart2;
    
    public void addToCart() {
    	Computing.click();
    	AddToCart1.click();
    	Fiction.click();
    	AddToCart2.click();
    
    }
  }
