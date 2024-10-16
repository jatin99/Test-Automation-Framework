package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;

@Listeners({ com.ui.listeners.TestListener.class })

public class SearchProductTest extends TestBase {

	private MyAccountPage myAccountPage;
	private static final String SEARCH_TERM = "Mens Wallet";

	@BeforeMethod(description = "Valid user logs into the application")
	public void setup() {
		myAccountPage = homePage.goToLoginPage().doLoginWith("bakomam596@skrak.com", "password");
	}

	@Test(description = "Verify if the logged in user is able to search for a product and correct products search result are displayed", groups = {
			"e2e", "smoke", "sanity" }

	)
	public void verifyproductSearchTest() {
		boolean actualResult = myAccountPage.searchForAProduct(SEARCH_TERM)
				.isSearchTermPresentInProductList(SEARCH_TERM);
		Assert.assertEquals(actualResult, true);
	}
}
