package com.ravi.algos;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] ints = selectionSort.selectionSort(new int[]{21, 3, 1, 45, 14, 1454, 14, 11, 3,0});
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }

    private int[] selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int index = i;
            for (int j = i+1;j<=arr.length-1;j++ ) {
                if (arr[j]<arr[index]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }


        return arr;
    }
}
