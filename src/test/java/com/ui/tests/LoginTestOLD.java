package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestOLD {

	public static void main(String[] args) {
		// Launch the browser window
		WebDriver wd = new ChromeDriver();

		// Go to the website
		wd.get("http://www.automationpractice.pl");

		// Maximize the browser window
		wd.manage().window().maximize();

		// Locate and click on the Sign In link
		By signInLinkLocator = By.xpath("//a[contains(text(),'Sign')]");
		WebElement signInLinkWebElement = wd.findElement(signInLinkLocator);
		signInLinkWebElement.click();

		// Locate and enter email
		By emailTextBoxLocator = By.id("email");
		WebElement emailTextBoxWebElement = wd.findElement(emailTextBoxLocator);
		emailTextBoxWebElement.sendKeys("bakomam596@skrak.com");

		// Locate and enter password
		By passwordTextBoxLocator = By.id("passwd");
		WebElement passwordTextBoxWebElement = wd.findElement(passwordTextBoxLocator);
		passwordTextBoxWebElement.sendKeys("password");

		// Locate and click on the login button
		By submitLoginButtonLocator = By.id("SubmitLogin");
		WebElement submitLoginButton = wd.findElement(submitLoginButtonLocator);
		submitLoginButton.click();
	}
}
