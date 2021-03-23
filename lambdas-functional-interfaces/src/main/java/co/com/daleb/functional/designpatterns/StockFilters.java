package co.com.daleb.functional.designpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

    // no functional
    public static List<Stock> bySymbol(List<Stock> list, String symbol){
     List<Stock> filterData = new ArrayList<>();

        for (Stock stock : list) {
            if (stock.getSymbol().equals(symbol))
                filterData.add(stock);
        }
     
     return filterData;
    }

    // no functional
    public static List<Stock> byPrice(List<Stock> list, double price){
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {
            if (stock.getPrice()>price)
                filteredData.add(stock);
        }

        return filteredData;
    }

    // Now this is the functional behaviour, and we can set so many strategy with just this method.
    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p){

        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {
            if (p.test(stock))
                filteredData.add(stock);
        }

        return filteredData;

    }

}
