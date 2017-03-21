package com.bovespa;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class StockManager {

	private int i = 0;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	public Stock[] loadStocks(String fileName) throws IOException {
		Stream<String> lines = Files.lines(Paths.get(fileName));
		Stock[] stocks = new Stock[(int) (lines.count() -2)];
		
		lines = Files.lines(Paths.get(fileName));
		lines.forEach(line -> {
			if (line.startsWith("01")) {
				
				Stock stock = new Stock();
				stock.setCode(line.substring(12, 24).trim());
				stock.setDate(LocalDate.parse(line.substring(2, 10), dtf));
				stock.setOpenPrice(new BigDecimal(line.substring(56, 67) + "." + line.substring(67, 69)));
				stock.setClosePrice(new BigDecimal(line.substring(108, 117) + "." + line.substring(119, 121)));
				stock.setMaxPrice(new BigDecimal(line.substring(69, 80) + "." + line.substring(80, 92)));
				stock.setMinPrice(new BigDecimal(line.substring(82, 93) + "." + line.substring(93, 95)));
				
				stocks[i++] = stock;
				//System.out.println(stock.getCode()+ " - " + stock.getDate());
				//System.out.println(line.substring(56, 69));
				//System.out.println(new BigDecimal("00000000041.50"));
			}
		});
		return stocks;
	}
}
