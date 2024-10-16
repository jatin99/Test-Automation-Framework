package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class ShippmentPage extends BrowserUtility{
	
	private static final By ACCEPT_TERMS_CHECKBOX_LOCATOR = By.id("uniform-cgv");
	private static final By PROCEED_TO_CHECKOUT_BUTTON_LOCATOR = By.name("processCarrier");

	
	public ShippmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public PaymentPage goToPaymentPage() {
		clickOn(ACCEPT_TERMS_CHECKBOX_LOCATOR);
		clickOn(PROCEED_TO_CHECKOUT_BUTTON_LOCATOR);
		return new PaymentPage(getDriver());
	}

}
