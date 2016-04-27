package org.gradle;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class TraderSteps extends Steps  { // look, Ma, I'm a POJO!!

	private Stock stock;
//	@Given("a stock of symbol $symbol and a threshold of $threshold")
//	public void aStock() {
//		String symbol = "STK1";
//		double threshold = 10.0;
//		stock = new Stock(symbol, threshold);
//	}
//
//	@When("the stock is traded at $price")
//	public void theStockIsTradedAt() {
//		double price = 10.0;
//		stock.tradeAt(price);
//	}
//
//	@Then("the alert status should be $status")
//	public void theAlertStatusShouldBe() {
//		String status = "OFF";
//		assertEquals(stock.getStatus(), status);
//
//	}


	@Given("a stock of symbol $symbol and a threshold of $threshold")
	public void aStock(@Named("symbol") String symbol, @Named("threshold") double threshold) {
		stock = new Stock(symbol, threshold);
	}

	@When("the stock is traded at $price")
	public void theStockIsTradedAt(@Named("price") double price) {
		stock.tradeAt(price);
	}

	@Then("the alert status should be $status")
	public void theAlertStatusShouldBe(@Named("status") String status) {
		assertEquals(stock.getStatus(), status);

	}
}
