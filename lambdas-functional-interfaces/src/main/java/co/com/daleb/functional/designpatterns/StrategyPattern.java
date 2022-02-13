package co.com.daleb.functional.designpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class StrategyPattern {

  public static void main(String[] args) {
    List<Stock> stockList = new ArrayList<>();
    stockList.add(new Stock("APPLE", 318.86, 10));
    stockList.add(new Stock("MSFT", 166.86, 45));
    stockList.add(new Stock("Google", 99, 12.5));
    stockList.add(new Stock("Amazon", 1866.75, 45));
    stockList.add(new Stock("Google", 1480.20, 3.5));
    stockList.add(new Stock("APPLE", 318.65, 8));
    stockList.add(new Stock("Amazon", 1866.73, 9));

    StockFilters.bySymbol(stockList, "Amazon").forEach(System.out::println);

    StockFilters.byPrice(stockList, 300).forEach(System.out::println);

    // at this point we have use the normal strategy design pattern

    // These are the functional use of strategy
    StockFilters
      .filter(stockList, stock -> stock.getSymbol().equals("Amazon"))
      .forEach(System.out::println);

    StockFilters.filter(stockList, stock -> stock.getPrice() > 300).forEach(System.out::println);
  }
}
