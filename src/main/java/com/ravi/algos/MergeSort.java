package com.ravi.algos;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeSort {
    public static void mergeSort(int[] input) {
        if (input.length == 1) {
            return;
        }
        int ind = 0;
        int midIndex = input.length / 2;
        int[] firstList = new int[midIndex];
        int[] secondList = new int[input.length - midIndex];
        for (int i = 0; i < input.length; i++) {
            if (i < midIndex) {
                firstList[i] = input[i];
            } else {
                secondList[ind++] = input[i];
            }
        }

        mergeSort(firstList);
        mergeSort(secondList);
        merge(input, firstList, secondList);

        display(input);
    }

    public static void merge(int[] input, int[] fList, int[] sList) {
        int mergeIndex = 0;
        int leftIndex = 0;
        int secondIndex = 0;
        while (leftIndex < fList.length && secondIndex < sList.length) {
            if (fList[leftIndex] < sList[secondIndex]) {
                input[mergeIndex++] = fList[leftIndex++];
            } else {
                input[mergeIndex++] = sList[secondIndex++];
            }
            display(input);
        }

        while (leftIndex < fList.length) {
            input[mergeIndex++] = fList[leftIndex++];
        }

        while (secondIndex < sList.length) {
            input[mergeIndex++] = sList[secondIndex++];
        }
    }

    private static void display(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();
        q.add("test");
        MergeSort.mergeSort(new int[]{5, 4, 7, 6, 1, 3, 2, 9, 8, 10});
    }

}
