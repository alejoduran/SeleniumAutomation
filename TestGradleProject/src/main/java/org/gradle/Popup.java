package org.gradle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Popup {

	@FindBy(id = "cboxClose")
	private WebElement linkCerrar;

	public void cerrarPopup() {

		linkCerrar.click();
	}
}
