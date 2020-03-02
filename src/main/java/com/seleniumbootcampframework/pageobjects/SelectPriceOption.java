package com.seleniumbootcampframework.pageobjects;

import org.openqa.selenium.By;

import com.seleniumbootcampframework.webelements.Button;

public class SelectPriceOption {
	public static class priceOption {
		private static Button _checkboxPriceOption = new Button("Price Option",
				By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]"));
		private static Button _buttonNext = new Button("Next Button",
				By.xpath("//*[@id='nextsendquote']"));
		
		public static void clickSelectPriceOption(){
			_checkboxPriceOption.click();
			_buttonNext.click();
			
		}
	}
}
