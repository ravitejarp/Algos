package com.ravi.algos;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] ints = insertionSort.insertionSort(new int[]{21, 3, 1, 45, 14, 1454, 14, 11, 3, 0});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }

    private int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int index = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    index = j;
                } else {
                    index = j;
                    break;
                }
            }
            if (index >= 0) {
                int valueToMove = arr[i];
                System.arraycopy(arr, index, arr, index, i + 1 - index);
                arr[index] = valueToMove;
            }
        }

        return arr;
    }
}
