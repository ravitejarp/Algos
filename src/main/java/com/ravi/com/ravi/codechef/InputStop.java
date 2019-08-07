package com.ravi.com.ravi.codechef;

import java.util.Scanner;
import java.util.Stack;

public class InputStop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        StringBuilder reader = new StringBuilder();
        while (scanner.hasNext()) {
            reader.append(scanner.next() + ",");
        }
        String[] inputVals = reader.toString().split(",");
        sortUsingMergeSort(inputVals);
        for (int i = 0; i < inputVals.length; i++) {
            if (Integer.parseInt(inputVals[i]) < 42) {
                System.out.println(inputVals[i]);
            } else
                break;
        }
    }

    private static String[] sortUsingMergeSort(String[] inputVals) {
        if (inputVals == null || inputVals.length == 1) {
            return inputVals;
        }

        int mid = inputVals.length / 2;
        String[] left = new String[mid];
        String[] right = new String[inputVals.length / 2 - mid];
        for (int i = 0; i < inputVals.length; i++) {
            if (i < mid) {
                left[i] = inputVals[i];
            } else {
                right[i - mid] = inputVals[i];
            }
        }

        sortUsingMergeSort(left);
        sortUsingMergeSort(right);
        return merge(inputVals, left, right);
    }

    private static String[] merge(String[] inputVals, String[] left, String[] right) {
        if (left == null && right == null) {
            return inputVals;
        }
        int k = 0, i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (Integer.parseInt(left[i]) < Integer.parseInt(right[j])) {
                inputVals[k++] = left[i++];
            } else {
                inputVals[k++] = right[j++];
            }
        }
        while (i < left.length) {
            inputVals[k++] = left[i++];
        }

        while (j < right.length) {
            inputVals[k++] = right[j++];
        }

        return inputVals;

    }
}
