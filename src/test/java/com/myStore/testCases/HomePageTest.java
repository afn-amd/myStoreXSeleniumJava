package com.myStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.BaseClass;
import com.myStore.pageObjects.HomePage;
import com.myStore.pageObjects.IndexPage;
import com.myStore.pageObjects.LoginPage;

public class HomePageTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	/*@Test
	public void wishListTest() throws Throwable {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homePage.validateMyWishList();
		Assert.assertTrue(result);
	}*/
	
	@Test
	public void orderHistoryAndDetailsTest() throws Throwable {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homePage.validateOrderHistory();
		Assert.assertTrue(result);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
