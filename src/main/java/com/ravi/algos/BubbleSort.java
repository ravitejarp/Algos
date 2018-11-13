package com.ravi.algos;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] ints = bubbleSort.bubbleSort(new int[]{21, 3, 1, 45, 14, 1454, 14, 11, 3,0});
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }

    private int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }

            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
        return arr;
    }
}
