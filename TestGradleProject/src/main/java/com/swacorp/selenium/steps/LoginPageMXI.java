package com.swacorp.selenium.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swacorp.selenium.page.HomePageMXI;

public class LoginPageMXI extends Steps {

	WebDriver driver;
//	Popup popup;
	HomePageMXI homePage;
//	SeleccionPeriodo seleccionPeriodo;
//	MainFrame mainFrame;

	@org.jbehave.core.annotations.BeforeStory
	public void init() {
	   
		System.setProperty("webdriver.ie.driver", "src/main/resources/org/gradle/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
	}

	@Given("Open the maintenix home page $url")
	public void givePage(@Named("url") String url) {
		driver.get(url);
//		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//	         .until(ExpectedConditions.presenceOfElementLocated(By.id("LinkSignIn")));
		
	}

	@When("login into home page set user $user and pass $pass")
	public void Authenticate(@Named("user") String user,@Named("pass") String pass) {
		try {
			
			homePage= PageFactory.initElements(driver, HomePageMXI.class);
			homePage.logIn(user, pass);
			Thread.sleep(2000);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	

	@Then("select menu for orders")
	public void selectMenu () {
		try {
//			seleccionPeriodo = PageFactory.initElements(driver, SeleccionPeriodo.class);
//			seleccionPeriodo.seleccionarPeriodoMasReciente();
//			Thread.sleep(5000);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("logout")
	public void logOut() {
//		mainFrame = PageFactory.initElements(driver, MainFrame.class);
//		mainFrame.logOut();
		driver.quit();
	}

}
