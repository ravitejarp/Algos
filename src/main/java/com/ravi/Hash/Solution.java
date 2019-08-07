package com.ravi.Hash;

import java.util.*;

public class Solution {

    // Complete the repeatedString function below.

    // Complete the minimumBribes function below.
//        static void minimumBribes(int[] q) {
//            int counter =0;
//            Map<Integer,Integer> map = new TreeMap<>();
//            for(int i=q.length-1;i>=0;i--){
//                if(q[i] - 3 > i){
//                    System.out.println("Too chaotic");
//                    return;
//                }
//                StringBuilder s = new StringBuilder("");
//                s.reverse().
//            if(map.get(q[i]) != null){
//                    counter += map.get(q[i]);
//                    continue;
//                }
//                for(int j = 0;j<=i;j++){
//                    Iterator<Map.Entry<Integer, Integer>> entryIterator = map.entrySet().iterator();
//                    int count = 0;
//                    while (entryIterator.hasNext()){
//                        Map.Entry<Integer, Integer> next = entryIterator.next();
//                        if(q[j] < next.getKey()){
//                            count++;
//                        }else{
//                            break;
//                        }
//                    }
//                    map.put(q[j],count);
//                }
//                counter += map.get(q[i]);
//            }
//            System.out.println(counter);
//
//        }


    static long arrayManipulation(int n, int[][] queries) {
        long maxVal = Long.MIN_VALUE;
        int[] arr = new int[n + 1];
        for (int i = 0; i < queries.length; i++) {
            arr[queries[i][0] - 1] += queries[i][2];
            arr[queries[i][1]] -= queries[i][2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i] + arr[i - 1];
            System.out.println(arr[i] + "\t" + arr[i - 1]);

            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        return maxVal;

    }


    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        arr[0][0] = 2;
        arr[0][1] = 6;
        arr[0][2] = 8;
        arr[1][0] = 3;
        arr[1][1] = 5;
        arr[1][2] = 7;
        arr[2][0] = 1;
        arr[2][1] = 8;
        arr[2][2] = 1;
        arr[3][0] = 5;
        arr[3][1] = 9;
        arr[3][2] = 15;

        System.out.println(arrayManipulation(10, arr));
    }
}
