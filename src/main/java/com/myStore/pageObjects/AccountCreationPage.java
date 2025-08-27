package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class AccountCreationPage extends BaseClass {
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/h1")
	WebElement formTitle;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAccountCreatePage() throws Throwable {
		return Action.isDisplayed(driver, formTitle);
	}

}
