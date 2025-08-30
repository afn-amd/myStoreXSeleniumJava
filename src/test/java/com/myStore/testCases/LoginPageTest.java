package com.myStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.BaseClass;
import com.myStore.pageObjects.HomePage;
import com.myStore.pageObjects.IndexPage;
import com.myStore.pageObjects.LoginPage;

public class LoginPageTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@Test
	public void loginTest() throws Throwable {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualUrl = homePage.getCurrUrl();
		String expectedUrl = "http://www.automationpractice.pl/index.php?controller=my-account";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
