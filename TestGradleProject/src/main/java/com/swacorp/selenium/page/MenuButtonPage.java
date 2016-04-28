package com.swacorp.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuButtonPage {
   
   private static final By MENU_MAIN_MENU_SEARCH = By.xpath("//*[@id='idMenuButton']");
      
   @FindBy(id="idMenuButton")
   private WebElement menuButton;
   
   public void clickMenuOrderButton ()
   {
      menuButton.click();
   }
   
   public void selectMenuHome() {
      menuButton.findElement(MENU_MAIN_MENU_SEARCH).click();
  }

   public void selectSubMenuSearch(By subMenuOne, By subMenuTwo) throws InterruptedException {
      selectMenuHome();
      Thread.sleep(2000);
//      clickWaitForElement(subMenuOne)
//      clickWaitForElement(subMenuTwo)
  }
   
}
