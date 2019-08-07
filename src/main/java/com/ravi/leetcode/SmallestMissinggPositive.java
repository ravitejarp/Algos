package com.ravi.leetcode;

import java.util.Arrays;

public class SmallestMissinggPositive {
    public static void main(String[] args) {
        SmallestMissinggPositive missinggPositive = new SmallestMissinggPositive();
        int[] ints = missinggPositive.mergeSort(new int[]{3, 1, 6, 99, 12, 33, 55});
        System.out.println(missinggPositive.getMissingPositive(new int[]{0, 1, -1, 3}));
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int getMissingPositive(int[] nums) {
        int[] ints = mergeSort(nums);
        int first = ints[0];
        boolean isFirstDone = false;
        for (int i = 1; i <= ints.length - 1; i++) {
            if (first <= 0) {
                first = ints[i];
            } else if (!isFirstDone && first != 1) {
                return 1;
            } else {
                if (!isFirstDone) {
                    isFirstDone = true;
                    first = ints[i];
                } else if (first + 1 != ints[i]) {
                    return first + 1;
                } else {
                    first = ints[i];
                }
            }
        }

        return ints[ints.length - 1] + 1;
    }

    public int[] mergeSort(int[] input) {
        if (input == null || input.length == 0 || input.length == 1) {
            return input;
        }
        int j = 0;
        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[input.length - mid];
        for (int i = 0; i < input.length; i++) {
            if (i < mid) {
                left[i] = input[i];
            } else {
                right[j++] = input[i];
            }
        }

        mergeSort(left);
        mergeSort(right);
        merge(input, left, right);
        return input;

    }

    private int[] merge(int[] input, int[] left, int[] right) {
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        int index = 0;
        int lefIndex = 0;
        int rightIndex = 0;
        while (lefIndex < left.length && rightIndex < right.length) {
            if (left[lefIndex] < right[rightIndex]) {
                input[index++] = left[lefIndex++];
            } else {
                input[index++] = right[rightIndex++];
            }
        }
        while (lefIndex < left.length) {
            input[index++] = left[lefIndex++];
        }
        while (rightIndex < right.length) {
            input[index++] = right[rightIndex++];
        }


        return input;
    }
}
