package com.ravi.algos;

public class MergeSortPractise {
    public static void main(String[] args) {
        int[] ints = new MergeSortPractise().mergeSort(new int[]{8, 7, 5, 6, 4, 3, 2, 1, 8, 7, 6, 5, 4, 3, 2, 1});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }

    public int[] mergeSort(int[] arrToBeSorted) {
        if (arrToBeSorted == null) {
            return null;
        }

        if (arrToBeSorted.length == 1) {
            return arrToBeSorted;
        }

        int mid = arrToBeSorted.length / 2;
        int[] left = new int[mid];
        int[] rigt = new int[arrToBeSorted.length - mid];
        for (int i = 0; i < arrToBeSorted.length; i++) {
            if (i < mid) {
                left[i] = arrToBeSorted[i];
            } else {
                rigt[i - mid] = arrToBeSorted[i];
            }
        }

        mergeSort(left);
        mergeSort(rigt);
        merge(left, rigt, arrToBeSorted);


        return arrToBeSorted;
    }

    private int[] merge(int[] left, int[] rigt, int[] sortedArray) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < left.length && j < rigt.length) {
            if (left[i] <= rigt[j]) {
                sortedArray[count++] = left[i++];
            } else if (left[i] > rigt[j]) {
                sortedArray[count++] = rigt[j++];
            }
        }
        while (i < left.length) {
            sortedArray[count++] = left[i++];
        }

        while (j < rigt.length) {
            sortedArray[count++] = rigt[j++];
        }
        return sortedArray;

    }
}
