package com.ravi.algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class QuickSort {
    public static void quickSort(int[] input) {
        if (input.length == 1) {
            return;
        }
        int pivotIndex = 0;
        int pivot = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < input[pivot]) {
                int temp = input[i];
                input[i] = input[pivot];
                input[pivot] = temp;
            } else {
                int temp = input[i];
                input[i] = input[pivot];
                input[pivot] = temp;
            }
            pivotIndex = i;
        }
        int ind = 0;
        int[] fL = new int[pivotIndex];
        int[] sL = new int[input.length - pivotIndex];
        for (int i = 0; i < input.length; i++) {
            if (i < pivotIndex) {
                fL[i] = input[i];
            } else {
                sL[ind++] = input[i];
            }
        }
        quickSort(fL);
        quickSort(sL);
        display(input);

    }

    private static void display(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort.quickSort(new int[]{5, 4, 7, 6, 1, 3, 2, 9, 8, 10});
    }
}
