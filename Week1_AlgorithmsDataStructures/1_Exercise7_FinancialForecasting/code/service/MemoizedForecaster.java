package service;

import java.util.HashMap;

public class MemoizedForecaster {
    private final HashMap<Integer, Double> cache = new HashMap<>();

    public double predict(double initial, double rate, int years) {
        if (years == 0) return initial;
        if (cache.containsKey(years)) return cache.get(years);
        double result = predict(initial, rate, years - 1) * (1 + rate);
        cache.put(years, result);
        return result;
    }
}
