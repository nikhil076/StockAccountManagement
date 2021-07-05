package com.bridgelabz.stockAccountManagement;

import java.util.Scanner;

public class StockManagementMain {

	public static void main(String[] args) {
		StockManagementService stockManagementService = new StockManagementServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Stock Management System");
		
		System.out.println("Enter number of stocks to be added :");
		int noOfStocks = scanner.nextInt();
		
		for (int index = 0; index < noOfStocks; index++) {
			
			Stocks stocks = new Stocks();
			System.out.println("Enter the name of the stock");
			stocks.setStockName(scanner.next());
			System.out.println("Enter number of shares :");
			stocks.setNoOfShare(scanner.nextInt());
			System.out.println("Enter share price : ");
			stocks.setSharePrice(scanner.nextDouble());
			stockManagementService.addStocks(stocks);
		}
		
		System.out.println("Press \n '1' to print all the stocks \n '2' to search a stock using its name \n '3' to calculate stock value and total value \n '4' to edit value in the stock using its name ");
		int key = scanner.nextInt();
		switch (key) 
		{
			case 1: 
			{
				stockManagementService.printStocks();
				break;
			}
			case 2: 
			{
				System.out.println("Enter the stock name to check its details :");
				stockManagementService.getStockByName(scanner.next());
				break;
			}
			case 3: 
			{
				stockManagementService.calculateStockValueAndTotalValue();
				break;
			}
			case 4: 
			{
				System.out.println("Enter the stock name to edit its details");
				stockManagementService.editStockByName(scanner.next());
				break;
			}
			default:
				System.out.println("Invalid number");
		}		
	}
}
