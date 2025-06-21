package test;

import service.*;

public class ForecastTest {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.05;
        int years = 10;

        double result1 = RecursiveForecaster.predict(initialValue, growthRate, years);
        MemoizedForecaster forecaster = new MemoizedForecaster();
        double result2 = forecaster.predict(initialValue, growthRate, years);

        System.out.println("Recursive Result: ₹" + result1);
        System.out.println("Memoized Result: ₹" + result2);
    }
}
