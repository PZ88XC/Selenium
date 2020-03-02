package com.seleniumbootcampframework.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import com.seleniumbootcampframework.dataobjects.TestData;
import com.seleniumbootcampframework.webelements.Button;
import com.seleniumbootcampframework.webelements.ListBox;
import com.seleniumbootcampframework.webelements.TextBox;

import jxl.read.biff.BiffException;

public class EnterProductData {

	public static class productData {
		private static TextBox _textboxStartDate = new TextBox("Start Date", By.xpath("//*[@id='startdate']"));
		private static ListBox _listboxInsuranceSum = new ListBox("Insurance Sum",
				By.xpath("//*[@id='insurancesum']"));
		private static ListBox _listboxMeritRating = new ListBox("Merit Rating", By.xpath("//*[@id='meritrating']"));
		private static ListBox _listboxDamageInsurance = new ListBox("Damage Insurance", By.xpath("//*[@id='damageinsurance']"));
		private static Button _checkboxOriginalProducts = new Button("Original Products", By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]"));
		private static ListBox _listboxCourtesyCar = new ListBox("Courtesy Car", By.xpath("//*[@id='courtesycar']"));
		private static Button _buttonNext = new Button("Next", By.xpath("//*[@id='nextselectpriceoption']"));
		
		public static void populateProductData() throws BiffException, IOException {
			_textboxStartDate.setText(TestData.Data.ProductData.StartDate());
			_listboxInsuranceSum.selectByVisibleText(TestData.Data.ProductData.InsuranceSum());
			_listboxMeritRating.selectByVisibleText(TestData.Data.ProductData.MeritRating());
			_listboxDamageInsurance.selectByVisibleText(TestData.Data.ProductData.DamageInsurance());
			_checkboxOriginalProducts.click();
			_listboxCourtesyCar.selectByVisibleText(TestData.Data.ProductData.CourtesyCar());
			_buttonNext.click();
		}
	}
}
