package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signInButton;
	
	@FindBy(name="email_create")
	WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	WebElement createNewAccountButton;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname, String pswd) throws Throwable {
		Action.type(username, uname);
		Action.type(password, pswd);
		Action.click(getDriver(), signInButton);
		return new HomePage();
	}
	
	public AddressPage login1(String uname, String pswd) throws Throwable {
		Action.type(username, uname);
		Action.type(password, pswd);
		Action.click(getDriver(), signInButton);
		return new AddressPage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable {
		Action.type(emailForNewAccount, newEmail);
		Action.click(getDriver(), createNewAccountButton);
		return new AccountCreationPage();
	}

}
