package com.seleniumbootcampframework.tests;

import org.testng.annotations.Test;

import com.seleniumbootcampframework.core.Log;
import com.seleniumbootcampframework.dataobjects.TestData;
import com.seleniumbootcampframework.pageobjects.AutomobilePage;
import com.seleniumbootcampframework.pageobjects.EnterInsurantData;
import com.seleniumbootcampframework.pageobjects.EnterProductData;
import com.seleniumbootcampframework.pageobjects.HomePage;
import com.seleniumbootcampframework.pageobjects.SelectPriceOption;
import com.seleniumbootcampframework.pageobjects.SendQuote;
import com.seleniumbootcampframework.core.Browser;

public class SuccessfulPurchaseOfItemsTest extends Browser {

	@Test
	public void successfulPurchaseOfItems() throws Exception {
		Log.setStoryName("Purchase of Items");
		Log.setTestScriptName("Successful Purchase of Items");
		Log.setTestScriptDescription("Navigate to the page and Purchase Items");

		getDriver().get(TestData.Urls.tricentrisVehicleInsuranceUrl());

		HomePage.TopSection.verifyAutomobileLinkisDisplayed();
		HomePage.TopSection.verifyTruckLinkisDisplayed();
		HomePage.TopSection.verifyMotorcycleLinkisDisplayed();
		HomePage.TopSection.verifyCamperLinkisDisplayed();
		HomePage.TopSection.navigateToAutomobileLink();
		
		AutomobilePage.TopSection.verifyAutomobileInsuranceIsDisplayed();
		AutomobilePage.TopSection.verifyEnterVehicleDataIsDisplayed();
		AutomobilePage.TopSection.verifyEnterInsuranceDataIsDisplayed();
		AutomobilePage.TopSection.verifyEnterProductDataIsDisplayed();
		AutomobilePage.TopSection.verifySelectPriceOptionIsDisplayed();
		AutomobilePage.TopSection.verifySendQuoteIsDisplayed();
		Thread.sleep(500);
		AutomobilePage.automobileData.populateAutoMobileData();
		Thread.sleep(500);
		EnterInsurantData.insurantData.populateInsuranteData();
		Thread.sleep(500);
		EnterProductData.productData.populateProductData();
		Thread.sleep(500);
		SelectPriceOption.priceOption.clickSelectPriceOption();
		Thread.sleep(500);
		SendQuote.populateQuota.populateQuotation();
		
		Browser.delay(60);

	}
}
