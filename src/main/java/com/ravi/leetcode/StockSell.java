package com.ravi.leetcode;

public class StockSell {

    public static void main(String[] args) {
        new StockSell().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        int buy = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println("BBuy:" + prices[buy]);
            System.out.println("Current:" + prices[i]);
            if (prices[buy] < prices[i]) {
                int x = prices[i] - prices[buy];
                System.out.println("Profit:" + x);
                if (profit < x) {
                    profit = x;
                }
            } else if (prices[buy] > prices[i]) {
                buy = i;
                max += profit;
                profit = 0;
            } else {
                buy = i;
            }
            System.out.println("Buy:" + buy);
            System.out.println("Max:" + max);
            System.out.println("Profit:" + profit);
            System.out.println("===================");
        }
        return max;
    }
}
