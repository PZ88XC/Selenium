package com.seleniumbootcampframework.pageobjects;

import org.openqa.selenium.By;

import com.seleniumbootcampframework.webelements.Element;

public class HomePage {

	public static class TopSection {

		private static Element _hyperlinkAutomobile = new Element("Automobile", By.xpath("//*[@id='nav_automobile']"));
		private static Element _hyperlinkTruck = new Element("Truck", By.xpath("//*[@id='nav_truck']"));
		private static Element _hyperlinkMotorcycle = new Element("Motorcycle", By.xpath("//*[@id='nav_motorcycle']"));
		private static Element _hyperlinkCamper = new Element("Camper", By.xpath("//*[@id='nav_motorcycle']"));
		
		//*[@id="entervehicledata"]

		public static void verifyAutomobileLinkisDisplayed() {
			_hyperlinkAutomobile.verifyDisplayed();
		}

		public static void verifyTruckLinkisDisplayed() {
			_hyperlinkTruck.verifyDisplayed();
		}

		public static void verifyMotorcycleLinkisDisplayed() {
			_hyperlinkMotorcycle.verifyDisplayed();
		}

		public static void verifyCamperLinkisDisplayed() {
			_hyperlinkCamper.verifyDisplayed();
		}

		public static void navigateToAutomobileLink() {
			_hyperlinkAutomobile.click();
		}

	}

	// Create Page Object and page objects method here..

}