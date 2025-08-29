package com.myStore.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myStore.base.BaseClass;
import com.myStore.pageObjects.IndexPage;

public class IndexPageText extends BaseClass {
	
	IndexPage indexPage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
	}
	
	@Test
	public void verifyLogo() throws Throwable {
		indexPage = new IndexPage();
		boolean result = indexPage.validateLogo();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyTitle() throws Throwable {
		String actTitle = indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Shop");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
