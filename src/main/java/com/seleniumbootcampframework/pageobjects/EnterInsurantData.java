package com.seleniumbootcampframework.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import com.seleniumbootcampframework.dataobjects.TestData;
import com.seleniumbootcampframework.webelements.Button;
import com.seleniumbootcampframework.webelements.ListBox;
import com.seleniumbootcampframework.webelements.TextBox;

import jxl.read.biff.BiffException;

public class EnterInsurantData {

	public static class insurantData {
		private static TextBox _textboxFirstname = new TextBox("First Name", By.xpath("//*[@id='firstname']"));
		private static TextBox _textboxLastname = new TextBox("Last Name", By.xpath("//*[@id='lastname']"));
		private static TextBox _textboxDOB = new TextBox("Date of Birth", By.xpath("//*[@id='birthdate']"));
		private static Button _radiobuttonGender = new Button("Gender",
				By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));

//		private static Button _radiobuttonGender(String gender) {
//			return new Button("Gender", By.xpath("//*/input[@value='" + gender + "']"));
//		}

		private static TextBox _textboxAddress = new TextBox("Address", By.xpath("//*[@id='streetaddress']"));
		private static ListBox _listboxCountry = new ListBox("Country ", By.xpath("//*[@id='country']"));
		private static TextBox _textboxZipCode = new TextBox("ZipCode ", By.xpath("//*[@id='zipcode']"));
		private static TextBox _textboxCity = new TextBox("City", By.xpath("//*[@id='city']"));
		private static ListBox _listboxOccupation = new ListBox("Occupation", By.xpath("//*[@id='occupation']"));
		private static Button _checkboxHobbies1 = new Button("Hobbies",
				By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
		private static Button _checkboxHobbies2 = new Button("Hobbies",
				By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]"));
		private static Button _buttonNext = new Button("Next", By.xpath("//*[@id='nextenterproductdata']"));

		public static void populateInsuranteData() throws BiffException, IOException {
			_textboxFirstname.setText(TestData.Data.InsurantData.Firstname());
			_textboxLastname.setText(TestData.Data.InsurantData.Lastname());
			_textboxDOB.setText(TestData.Data.InsurantData.DOB());
			_radiobuttonGender.click();
			_textboxAddress.setText(TestData.Data.InsurantData.StreetAddress());
			_listboxCountry.selectByVisibleText(TestData.Data.InsurantData.Country());
			_textboxZipCode.setText(TestData.Data.InsurantData.ZipCode());
			_textboxCity.setText(TestData.Data.InsurantData.City());
			_listboxOccupation.selectByVisibleText(TestData.Data.InsurantData.Occupation());
			_checkboxHobbies1.click();
			_checkboxHobbies2.click();
			_buttonNext.click();
		}
	}
}
