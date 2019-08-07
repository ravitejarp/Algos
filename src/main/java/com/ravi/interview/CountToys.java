package com.ravi.interview;

public class CountToys {
    static int maximumToys(int[] prices, int k) {
        sortArray(prices);
        int sum = 0;
        int numOfToys = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] + sum <= k) {
                sum += prices[i];
                numOfToys++;
            }

            if (sum == k) {
                return numOfToys;
            }
        }
        return numOfToys;
    }

    static int[] sortArray(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length - i - 1; j++) {
                if (prices[j] < prices[j + 1]) {
                    prices[j] = prices[j] + prices[j + 1];
                    prices[j + 1] = prices[j] - prices[j + 1];
                    prices[j] = prices[j] - prices[j + 1];
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        maximumToys(new int[]{1, 2, 3, 4}, 7);
    }
}
