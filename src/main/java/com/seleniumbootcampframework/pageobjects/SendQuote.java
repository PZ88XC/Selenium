package com.seleniumbootcampframework.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import com.seleniumbootcampframework.dataobjects.TestData;
import com.seleniumbootcampframework.webelements.Button;
import com.seleniumbootcampframework.webelements.TextBox;

import jxl.read.biff.BiffException;

public class SendQuote {
	public static class populateQuota {
		//*[@id="email"]
		private static TextBox _textboxEmail = new TextBox("Email", By.xpath("//*[@id='email']"));
		private static TextBox _textboxUsername = new TextBox("Username", By.xpath("//*[@id='username']"));
		private static TextBox _textboxPassword = new TextBox("Password", By.xpath("//*[@id='password']"));
		private static TextBox _textboxConfirmPassword = new TextBox("Confirm Password", By.xpath("//*[@id='confirmpassword']"));
		private static Button _buttonSend = new Button("Send", By.xpath("//*[@id='sendemail']"));
		private static Button _buttonSendEmail = new Button("Send Email", By.xpath("/html/body/div[4]/div[7]/div/button"));
		
		public static void populateQuotation() throws BiffException, IOException{
			_textboxEmail.setText(TestData.Data.QuotaData.Email());
			_textboxUsername.setText(TestData.Data.QuotaData.Username());
			_textboxPassword.setText(TestData.Data.QuotaData.Password());
			_textboxConfirmPassword.setText(TestData.Data.QuotaData.Password());
			_buttonSend.click();
			_buttonSendEmail.click();
		}
		}
	}

