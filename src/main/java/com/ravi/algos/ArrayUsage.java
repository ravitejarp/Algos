package com.ravi.algos;

import java.util.Random;

public class ArrayUsage {
    private static int numOfElems = 0;
    public static void main(String[] args) {
        int[] arrOfInts = new int[100];

        for(int i=0;i<10;i++){
            arrOfInts[i] = new Random().nextInt();
        }
        numOfElems = arrOfInts.length;
        displayEle(arrOfInts);
        int eleAvailable = isEleAvailable(25, arrOfInts);
        if(eleAvailable !=-1){
            System.out.println(String.format("Element %d found at index:%d",25,eleAvailable));
        }else{
            System.out.println("Element not found");
        }
        int i = deleteTheEle(112, arrOfInts);
        if(i!=-1){
            System.out.println("Element deleted at index:"+i);
        }else{
            System.out.println("Ele not found");
        }

    }
    private static void displayEle(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i);
        }
    }

    private static int isEleAvailable(int ele,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }

    private static int deleteTheEle(int ele,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                deleteAndCopyTheArray(i,arr);
                numOfElems--;
                return i;
            }
        }
        return -1;
    }

    private static void deleteAndCopyTheArray(int index, int[] arr) {
        for(int i=index;i+1<arr.length;i++){
            arr[i]=arr[i+1];
        }

    }
}
