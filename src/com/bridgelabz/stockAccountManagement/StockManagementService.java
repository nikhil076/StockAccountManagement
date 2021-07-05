package com.bridgelabz.stockAccountManagement;

public interface StockManagementService {
	public void addStocks(Stocks stocks);
	public void printStocks();
	public void getStockByName(String stockName);
	public void calculateStockValueAndTotalValue();
	public void editStockByName(String stockName);
}
