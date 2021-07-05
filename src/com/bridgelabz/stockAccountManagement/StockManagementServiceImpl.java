package com.bridgelabz.stockAccountManagement;

import java.util.LinkedList;
import java.util.Scanner;

public class StockManagementServiceImpl implements StockManagementService{

	LinkedList<Stocks> stockList = new LinkedList<>();
	double totalValue = 0;
	
	@Override
	public void addStocks(Stocks stocks) {
		if(stockList.contains(stocks))
		{
			System.out.println("Items exist in Inventory");
		}
		stockList.add(stocks);
	}

	@Override
	public void printStocks() {
		for (Stocks stocks : stockList) {
			System.out.println(stocks);
		}
	}

	@Override
	public void getStockByName(String stockName) {
		for (Stocks stocks : stockList) {
			if(stocks.getStockName().equals(stockName))
			{
				System.out.println(stocks);
			}
			else
				System.out.println("Not Found");
		}
	}

	@Override
	public void calculateStockValueAndTotalValue() {
		for (Stocks stocks : stockList) {
			double stockValue = stocks.getNoOfShare()*stocks.getSharePrice();
			System.out.println("The stock value of "+stocks.getStockName()+" is "+stockValue);
			totalValue += stockValue;
		}
		System.out.println("Total value is : "+totalValue);
	}

	@Override
	public void editStockByName(String stockName) {
		for (Stocks stocks : stockList) {
			if(stocks.getStockName().equals(stockName))
			{
				Scanner scanner = new Scanner(System.in);
				System.out.println("Old Data :");
				System.out.println(stocks);
				System.out.println("Enter the new number of shares in stock :");
				stocks.setNoOfShare(scanner.nextInt());
				System.out.println("Enter the new share price :");
				stocks.setSharePrice(scanner.nextDouble());
				System.out.println("New Data :" +stocks);
				scanner.close();
			}
		}
	}

	
}
