package org.gradle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFrame {

	@FindBy(id="Menu3_lnkBtnSalir")
	private WebElement linkSalir;
	
	public void logOut ()
	{
		linkSalir.click();
	}
}
