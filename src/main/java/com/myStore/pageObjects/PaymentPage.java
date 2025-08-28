package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class PaymentPage extends BaseClass {
	
	@FindBy(xpath="//a[contains(text(),'Pay by bank wire')]")
	WebElement bankWireMethod;
	
	@FindBy(xpath="//a[contains(text(),'Pay by check')]")
	WebElement payByCheckMethod;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummaryPage clickOnPaymentMethod() throws Throwable {
		Action.click(driver, bankWireMethod);
		return new OrderSummaryPage();
	}

}
