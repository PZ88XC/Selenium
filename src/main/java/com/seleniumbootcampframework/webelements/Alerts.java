package com.seleniumbootcampframework.webelements;

import com.seleniumbootcampframework.core.Browser;

public class Alerts extends Browser {

	public static void acceptAlert() {
		getDriver().switchTo().alert().accept();
	}

}
