package test;

import subject.StockMarket;
import observer.MobileApp;
import observer.WebApp;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stock = new StockMarket("INFY");

        MobileApp mobile = new MobileApp("Alice");
        WebApp web = new WebApp("Bob");

        stock.registerObserver(mobile);
        stock.registerObserver(web);

        stock.setPrice(1500.00);
        stock.setPrice(1520.50);

        stock.removeObserver(web);
        stock.setPrice(1535.75);
    }
}
