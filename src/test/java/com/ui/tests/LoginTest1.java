package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest1 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();// Launch a Browser Window!! Browser Session is created!!

		BrowserUtility browserUtility = new BrowserUtility(wd);
		browserUtility.goToWebsite("http://www.automationpractice.pl");
		browserUtility.maximizeWindow();

		By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign\")]");
		browserUtility.clickOn(signInLinkLocator);

		By emailTextBoxLocator = By.id("email");

		browserUtility.enterText(emailTextBoxLocator, "bakomam596@skrak.com");

		By passwordTextBoxLocator = By.id("passwd");

		browserUtility.enterText(passwordTextBoxLocator, "password");

		By submitLoginButtonLocator = By.id("SubmitLogin");
		browserUtility.clickOn(submitLoginButtonLocator);

	}

}
