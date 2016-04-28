package com.swacorp.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageMXI {

	@FindBy(id = "j_username")
	private WebElement userText;

	@FindBy(id = "j_password")
	private WebElement passwordText;

	@FindBy(id = "idButtonLogin")
	private WebElement bottonSignIn;

	public void logIn(String user, String password) {
	   userText.sendKeys(user);
		passwordText.sendKeys(password);
		bottonSignIn.click();
	}

}
