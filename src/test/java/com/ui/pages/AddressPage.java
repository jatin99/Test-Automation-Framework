package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.pojo.AddressPOJO;
import com.utility.BrowserUtility;

public class AddressPage extends BrowserUtility {

	private static final By COMPANY_TEXTBOX_LOCATOR = By.id("company");
	private static final By ADDRESS1_TEXTBOX_LOCATOR = By.id("address1");
	private static final By ADDRESS2_TEXTBOX_LOCATOR = By.id("address2");
	private static final By CITY_TEXTBOX_LOCATOR = By.id("city");
	private static final By POST_CODE_TEXTBOX_LOCATOR = By.id("postcode");
	private static final By HOME_PHONE_TEXTBOX_LOCATOR = By.id("phone");
	private static final By MOBILE_NUMBER_TEXTBOX_LOCATOR = By.id("phone_mobile");
	private static final By OTHER_INFORMATION_TEXTAREA_LOCATOR = By.id("other");
	private static final By ADDRESS_ALIAS_TEXTBOX_LOCATOR = By.id("alias");
	private static final By STATE_DROPDOWN_LOCATOR = By.id("id_state");
	private static final By SAVE_ADDRESS_BUTTON_LOCATOR = By.id("submitAddress");
	private static final By ADDRESS_HEADING = By.tagName("h3");

	public AddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String saveAddress(AddressPOJO addressPOJO) {
		enterText(COMPANY_TEXTBOX_LOCATOR, addressPOJO.getCompany());
		enterText(ADDRESS1_TEXTBOX_LOCATOR, addressPOJO.getAddressLine1());
		enterText(ADDRESS2_TEXTBOX_LOCATOR, addressPOJO.getAddressLine2());
		enterText(CITY_TEXTBOX_LOCATOR, addressPOJO.getCity());
		enterText(POST_CODE_TEXTBOX_LOCATOR, addressPOJO.getPostCode());
		enterText(HOME_PHONE_TEXTBOX_LOCATOR, addressPOJO.getHomePhoneNumber());
		enterText(MOBILE_NUMBER_TEXTBOX_LOCATOR, addressPOJO.getMobileNumber());
		enterText(OTHER_INFORMATION_TEXTAREA_LOCATOR, addressPOJO.getOtherInformation());
		clearText(ADDRESS_ALIAS_TEXTBOX_LOCATOR);
		enterText(ADDRESS_ALIAS_TEXTBOX_LOCATOR, addressPOJO.getAddressAlias());
		selectFromDropDown(STATE_DROPDOWN_LOCATOR, addressPOJO.getState());
		clickOn(SAVE_ADDRESS_BUTTON_LOCATOR);
		String newAddress = getVisibleText(ADDRESS_HEADING);
		return newAddress;
	}

}
