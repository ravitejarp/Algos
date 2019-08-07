package com.ravi.algos;

public class QSV2 {

    public static void main(String[] args) {
        String sample = "Ravi";
        String sample1 = "Teja";
        System.out.println(sample.compareTo(sample1));


        int[] ints = sortArray(new int[]{5, 4, 3, 2, 1, 10}, 0, 4);
        for (int i : ints) {
            System.out.print(i + ",");
        }
    }

    static int[] sortArray(int[] prices, int low, int high) {
        if (low >= high) {
            return prices;
        }
        int l = low, h = high;
        int pivot = prices[low];
        while (l < h) {
            while (prices[l] < pivot && l < h) {
                l++;
            }
            while (prices[h] > pivot) {
                h--;
            }
            if (l != h) {
                swap(prices, l, h);
            }

        }
        if (h > 0) {
            sortArray(prices, low, h - 1);
        }
        sortArray(prices, h + 1, high);

        return prices;
    }

    private static void swap(int[] prices, int l, int h) {
        int temp = prices[l];
        prices[l] = prices[h];
        prices[h] = temp;
    }
}
