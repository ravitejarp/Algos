package com.ravi.binarysearch;

public class BinarySearchImpl {
    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl();
        System.out.println(binarySearch.binarySearch(new int[]{1, 12, 13, 324, 1324, 2344}, 12, 0, 6));
        binarySearch.binarySearch(new int[]{1, 12, 13, 324, 1324, 2344}, 12);
        binarySearch.binarySearch(new int[]{1, 12, 13, 324, 1324, 2344}, 112);
    }

    public int binarySearch(int[] arr, int eleToFind, int start, int end) {
        int middle = (end + start) / 2;
        System.out.println("Middle" + middle);
        if (eleToFind == arr[middle]) {
            System.out.println("Mid:" + arr[middle]);
            return middle;
        } else if (eleToFind > arr[middle]) {
            System.out.println("Mid:" + arr[middle]);
            System.out.println(String.format("Start:%d,End:%d", middle + 1, end));
            binarySearch(arr, eleToFind, middle + 1, end);
        } else if (eleToFind < arr[middle]) {
            System.out.println("Mid:" + arr[middle]);
            System.out.println(String.format("Start:%d,End:%d", start, middle - 1));
            binarySearch(arr, eleToFind, start, middle);
        }
        return -1;
    }

    public void binarySearch(int[] arr,int eleToFind){
        int start =0;
        int end = arr.length;
        while(true){
            int middle = (start + end)/2;
            if(arr[middle]==eleToFind){
                System.out.println("Found ele at index:"+middle);
                break;
            }
            if(start>end){
                System.out.println("Element not found");
                break;
            }
            if(arr[middle]>eleToFind){
                end = middle-1;
            }else{
                start = middle+1;
            }
        }
    }
}
