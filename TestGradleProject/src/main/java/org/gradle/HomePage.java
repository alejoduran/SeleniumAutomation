package org.gradle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "TextBoxUsuario")
	private WebElement textoUsuario;

	@FindBy(id = "TextBoxClave")
	private WebElement textoClave;

	@FindBy(id = "LinkIngresar")
	private WebElement botonIngresar;

	public void logIn(String usuario, String clave) {
		textoUsuario.sendKeys(usuario);
		textoClave.sendKeys(clave);

		botonIngresar.click();
	}

}
