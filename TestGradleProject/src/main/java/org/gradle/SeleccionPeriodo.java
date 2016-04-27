package org.gradle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SeleccionPeriodo {

	@FindBy(id="cphMain_DropDownListMesPeriodo")
	private WebElement listaPeriodoSeleccion;
	
	@FindBy(id="cphMain_ButtonContinuar")
	private WebElement botonContinuar;
	
	public void seleccionarPeriodoMasReciente ()
	{
		Select select = new Select (listaPeriodoSeleccion);
		select.selectByIndex(1);
		
		botonContinuar.click();
	}
}
