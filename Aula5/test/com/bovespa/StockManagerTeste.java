package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTeste {

	
	@Test
	public void loadStocksTest() throws IOException{
		StockManager stockManager = new StockManager();
		stockManager.loadStocks("E:\Univille\3º Ano\Estrutura de Dados\COTAHIST_A2016_TEST.txt");
	}	
}
