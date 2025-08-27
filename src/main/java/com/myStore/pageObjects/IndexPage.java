package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	WebElement signInBtn;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img")
	WebElement myStoreLogo;
	
	@FindBy(id="search_query_top")
	WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	WebElement searchButton;
	
	//to initialize page objects
	public IndexPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public LoginPage clickOnSignIn() throws Throwable {
		Action.click(driver, signInBtn);
		return new LoginPage();
	}
	
	public boolean validateLogo() throws Throwable {
		return Action.isDisplayed(driver, myStoreLogo);
	}
	
	public String getMyStoreTitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchProductBox, productName);
		Action.click(driver, searchButton);
		return new SearchResultPage();
	}
	
}