package com.ravi.leetcode;

public class MinIndex {

    public static void main(String[] args) {
        MinIndex minIndex = new MinIndex();
        System.out.println(minIndex.arrayPairSum(new int[]{7, 3, 1, 0, 0, 6}));
    }

    public int arrayPairSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        int finalSum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            System.out.println(nums[i]);
            finalSum += nums[i];
        }
        return finalSum;
    }
}
