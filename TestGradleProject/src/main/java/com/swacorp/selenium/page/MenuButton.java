package com.swacorp.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuButton {
   
   @FindBy(id="idMenuButton")
   private WebElement menuButton;
   
   public void clickMenuButton ()
   {
      menuButton.click();
   }

}
