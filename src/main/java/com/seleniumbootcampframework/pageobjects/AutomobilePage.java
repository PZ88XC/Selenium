package com.seleniumbootcampframework.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import com.seleniumbootcampframework.dataobjects.TestData;
import com.seleniumbootcampframework.webelements.Button;
import com.seleniumbootcampframework.webelements.Element;
import com.seleniumbootcampframework.webelements.ListBox;
import com.seleniumbootcampframework.webelements.TextBox;

import jxl.read.biff.BiffException;

public class AutomobilePage {

	public static class TopSection {

		private static Element _hyperlinkAutomobileInsurance = new Element("Automobile Insurance",
				By.xpath("//*[@id='selectedinsurance']"));
		private static Element _hyperlinkEnterVehicleData = new Element("Enter Vehicle Data",
				By.xpath("//*[@id='entervehicledata']"));
		private static Element _hyperlinkEnterInsuranceData = new Element("Enter Insurance Data",
				By.xpath("//*[@id='enterinsurantdata']"));
		private static Element _hyperlinkEnterProductData = new Element("Enter Product Data",
				By.xpath("//*[@id='enterproductdata']"));
		private static Element _hyperlinkSelectPriceOption = new Element("Select Price Option",
				By.xpath("//*[@id='selectpriceoption']"));
		private static Element _hyperlinkSendQuote = new Element("Send Quote", By.xpath("//*[@id='sendquote']"));

		public static void verifyAutomobileInsuranceIsDisplayed() {
			_hyperlinkAutomobileInsurance.verifyDisplayed();
		}

		public static void verifyEnterVehicleDataIsDisplayed() {
			_hyperlinkEnterVehicleData.verifyDisplayed();
		}

		public static void verifyEnterInsuranceDataIsDisplayed() {
			_hyperlinkEnterInsuranceData.verifyDisplayed();
		}

		public static void verifyEnterProductDataIsDisplayed() {
			_hyperlinkEnterProductData.verifyDisplayed();
		}

		public static void verifySelectPriceOptionIsDisplayed() {
			_hyperlinkSelectPriceOption.verifyDisplayed();
		}

		public static void verifySendQuoteIsDisplayed() {
			_hyperlinkSendQuote.verifyDisplayed();
		}

	}

	public static class automobileData {
		private static ListBox _listboxMake = new ListBox("Make", By.xpath("//*[@id='make']"));
		private static TextBox _textboxEnginePerformace = new TextBox("Engine Performace",
				By.xpath("//*[@id='engineperformance']"));
		private static TextBox _textboxDateOfManufacture = new TextBox("Date Of Manufacture",
				By.xpath("//*[@id='dateofmanufacture']"));
		private static ListBox _listboxNumberOfSeats = new ListBox("Number Of Seats",
				By.xpath("//*[@id='numberofseats']"));
		private static ListBox _listboxFuelType = new ListBox("FuelType", By.xpath("//*[@id='fuel']"));
		private static TextBox _textboxListPrice = new TextBox("List Price",
				By.xpath("//*[@id='listprice']"));
		private static TextBox _textboxLiscencePlateNumber = new TextBox("Liscence Plate Number",
				By.xpath("//*[@id='licenseplatenumber']"));
		private static TextBox _textboxAnnualMileage = new TextBox("Annual Mileage",
				By.xpath("//*[@id='annualmileage']"));
		private static Button _buttonNext = new Button("Next",
				By.xpath("//*[@id='nextenterinsurantdata']"));

		public static void populateAutoMobileData() throws BiffException, IOException {
			_listboxMake.selectByVisibleText(TestData.Data.EngineVehicleData.Make());
			_textboxEnginePerformace.setText(TestData.Data.EngineVehicleData.Engine());
			_textboxDateOfManufacture.setText(TestData.Data.EngineVehicleData.Date());
			_listboxNumberOfSeats.selectByVisibleText(TestData.Data.EngineVehicleData.Seats());
			_listboxFuelType.selectByVisibleText(TestData.Data.EngineVehicleData.Fuel());
			_textboxListPrice.setText(TestData.Data.EngineVehicleData.Price());
			_textboxLiscencePlateNumber.setText(TestData.Data.EngineVehicleData.License());
			_textboxAnnualMileage.setText(TestData.Data.EngineVehicleData.Mileage());
			_buttonNext.click();
		}
	}
	
	

}
