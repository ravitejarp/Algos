package com.ravi.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsWithGivenSum {
    public static void main(String[] args) {
        pairsForGivenSum(new int[]{1, 2, 3, 4, 5, 6, 7, 9, 12, -1, 14, -1}, 13);
        pairsFForGivenSum_Sort(new int[]{1, 2, 3, 4, 5, 6, 7, 9, 12, -1, 14, -1}, 13);
    }

    static void pairsForGivenSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = sum - arr[i];
            if (map.get(val) == null) {
                map.put(arr[i], 1);
                continue;
            }
            System.out.println("Pairs:" + arr[i] + "," + val);
        }
    }

    static void pairsFForGivenSum_Sort(int[] arr, int sum) {
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1; i <= j; ) {
            if (arr[i] + arr[j] == sum) {
                System.out.println("Pairs:" + arr[i] + "," + arr[j]);
                i++;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
    }
}
