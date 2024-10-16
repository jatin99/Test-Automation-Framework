package com.ui.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class SearchResultPage extends BrowserUtility {

	private static final By PRODUCT_LISTING_TITLE_LOCATOR = By.xpath("//span[@class=\"lighter\"]");

	private static final By ALL_PRODUCT_LISTS_NAME = By.xpath("//h5[@itemprop=\"name\"]/a");

	public SearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getSearchResultTitle() {
		return getVisibleText(PRODUCT_LISTING_TITLE_LOCATOR);
	}

	public boolean isSearchTermPresentInProductList(String searchTerm) {
		List<String> keywords=Arrays.asList(searchTerm.toLowerCase().split(" "));
		List<String> productNamesList=getAllVisibleText(ALL_PRODUCT_LISTS_NAME);
		boolean  result=productNamesList.stream()
		.anyMatch(name -> (keywords.stream().anyMatch(name.toLowerCase()::contains)));
		return result;
	}
	
	
	public ProductDetailPage clickOnTheProductAtIndex(int index) {
		clickOn(getAllElements(ALL_PRODUCT_LISTS_NAME).get(index));
		ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());
		return productDetailPage;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
