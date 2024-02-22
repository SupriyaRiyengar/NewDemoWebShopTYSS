package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {
	
	public ShoppingCartPage(WebDriver driver) {
	super(driver);
}
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	
	public void clickShoppingCart() {
		shoppingCart.click();
	}
	
	@FindBy(xpath="(//input[@name=\"removefromcart\"])[1]")
	private WebElement checkbox1;
	
	public void clickCheckBox1() {
		checkbox1.click();
	}	
	
	@FindBy(xpath="(//input[@name=\"removefromcart\"])[2]")
	private WebElement checkbox2;
	
	public void clickCheckBox2() {
		checkbox2.click();
	}
	
	@FindBy(xpath="//td/a[text()='Computing and Internet']")
	private WebElement FirstProductName;
	
	public String firstProductName() {
		return FirstProductName.getText();
	}
	
	@FindBy(xpath="//td/a[text()='Fiction']")
	private WebElement SecondProductName;
	
	public String secondProductName() {
		return SecondProductName.getText();
	}
	
	@FindBy(xpath="(//td[@class=\"unit-price nobr\"])[1]")
	private WebElement FirstProductPrice;
	
	public String firstProductPrice() {
		return FirstProductPrice.getText();
	}
	
	@FindBy(xpath="(//td[@class=\"unit-price nobr\"])[2]")
	private WebElement SecondProductPrice;
	
	public String secondProductPrice() {
		return SecondProductPrice.getText();
    }
	
	@FindBy(xpath="(//input[@class=\"qty-input\"])[1]")
	private WebElement FirstProductQuantity;
	
	    public String firstProductQuantity() {
		return FirstProductQuantity.getText();
	}
	
	@FindBy(xpath="(//input[@class=\"qty-input\"])[2]")
	private WebElement SecondProductQuantity;
	
	public String secondProductQuantity() {
		return SecondProductQuantity.getText();
	}
	
	@FindBy(xpath="(//span[@class=\"product-subtotal\"])[1]")
	private WebElement FirstProductTotal;
	
	public String firstProductTotal() {
		return FirstProductTotal.getText();
	}
	
	@FindBy(xpath="(//span[@class=\"product-subtotal\"])[2]")
	private WebElement SecondProductTotal;
  
	public String secondProductTotal() {
		return SecondProductTotal.getText();
	}

	@FindBy(xpath="//input[@name=\"updatecart\"]")
	private WebElement UpdateCart;
	
	
	
	
	

	
		
		
		
	
	
		
//		public void changeFirstProductQuantity(String quantity) {
//			FirstProductQuantity.clear();
//			FirstProductQuantity.sendKeys(quantity);
//			UpdateCart.click();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
