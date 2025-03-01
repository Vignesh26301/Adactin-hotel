package com.adactin.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactin.factory.PageinstancesFactory;
import com.adactin.pages.AdactinHomePage;


/**
 * The Class FaceBookLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Adactin Home Page test", description = "Adactin Home page test cases")
public class AdactinHomeTest extends BaseTest {

	@Test
	public void facebookLoginTest() {
		driver.get("https://adactinhotelapp.com/");
		AdactinHomePage adactinHomePage = PageinstancesFactory.getInstance(AdactinHomePage.class);
		Assert.assertTrue(adactinHomePage.homePageLogoExist(), "Home Page Logo is not displayed");
		Assert.assertTrue(adactinHomePage.homePageUsernameFieldExist(), "Home Page username field is not displayed");
		Assert.assertTrue(adactinHomePage.homePagePasswordFieldExist(), "Home Page password is not displayed");
		Assert.assertTrue(adactinHomePage.homePageLoginButtonExist(), "Home Page Login is not displayed");
		Assert.assertTrue(adactinHomePage.homePageRegLinkExist(), "Home Page Registration Link is not displayed");

	}
}
