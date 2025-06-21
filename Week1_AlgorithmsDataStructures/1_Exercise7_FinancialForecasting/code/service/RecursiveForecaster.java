package service;

public class RecursiveForecaster {
    public static double predict(double initial, double rate, int years) {
        if (years == 0) return initial;
        return predict(initial, rate, years - 1) * (1 + rate);
    }
}
