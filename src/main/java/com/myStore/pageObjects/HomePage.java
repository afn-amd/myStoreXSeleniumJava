package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class HomePage extends BaseClass {

	// @FindBy(xpath="")
	// WebElement myWishList;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/ul/li[1]/a/span")
	WebElement orderHistory;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	/*
	 * public boolean validateMyWishList() throws Throwable{ return
	 * Action.isDisplayed(driver, myWishList); }
	 */

	public boolean validateOrderHistory() throws Throwable {
		return Action.isDisplayed(getDriver(), orderHistory);
	}

	public String getCurrUrl() {
		String homePageUrl = getDriver().getCurrentUrl();
		return homePageUrl;
	}

}
