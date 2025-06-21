Project: FinancialForecast

This project predicts future financial value using:
- Recursive approach
- Optimized memoized recursion

Formula: FV = P × (1 + r)^n

Time Complexity:
- Recursive: O(n) time, O(n) stack space
- Memoized: O(n) time, O(n) space, avoids redundant work

Optimization:
- Use memoization or convert to iterative to avoid deep call stacks and repeated calculations.

By running ForecastTest.java we can compare the time complexity of the recursive algorithm.
