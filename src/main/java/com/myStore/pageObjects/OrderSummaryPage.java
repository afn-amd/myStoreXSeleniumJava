package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class OrderSummaryPage extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	WebElement confirmOrderButton;

	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}

	public OrderConfirmationPage clickOnConfirmOrderButton() {
		Action.click(driver, confirmOrderButton);
		return new OrderConfirmationPage();
	}

}
