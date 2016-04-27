package org.gradle;

public class Stock {
	private String symbol;
	private double threshold;
	private String status;

	public Stock(String symbol, double threshold) {
		super();
		this.symbol = symbol;
		this.threshold = threshold;
	}

	public void tradeAt(double price) {
		if (price >= 5.0){
			this.status = "OFF";
		}else{
			this.status ="ON";
		}

	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getThreshold() {
		return threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
