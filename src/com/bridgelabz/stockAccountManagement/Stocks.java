package com.bridgelabz.stockAccountManagement;

public class Stocks {
	String stockName;
	int noOfShare;
	double sharePrice;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {
		return "Stocks [stockName=" + stockName + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + "]";
	}
}
