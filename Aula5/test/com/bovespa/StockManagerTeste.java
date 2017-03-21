package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTeste {

	@Test
	public void loadStocksTest() throws IOException {
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStocks("D:\\Univille\\3ºAno\\EstruturadeDados\\COTAHIST_A2016.txt");
		/*
		for(Stock stock : stocks){
			System.out.println(stock.getCode());
		}*/
		
		for(Stock stock : stocks){
			if(stock.getCode().equals("PETR4") && stock.getDate().getDayOfYear() == 2016 && stock.getDate().getDayOfMonth() == 03 && stock.getDate().getMonthValue() == 21){
				System.out.println(stock.getOpenPrice());
				
			}
			
			//System.out.println(stock.getCode());
		}
	
	}
}
