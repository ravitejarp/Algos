package com.ravi.leetcode;

import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        MultiDArray multiDArray = new MultiDArray();
        System.out.println(Arrays.deepToString(multiDArray.flipAndInvertImage(arr)));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int x = A[0].length;
        int[][] reversedArray = new int[x][x];
        for (int i = 0; i < x; i++) {
            int k = 0;
            for (int j = A[i].length - 1; j >= 0; j--) {
                if (A[i][j] == 0)
                    reversedArray[i][k++] = 1;
                else
                    reversedArray[i][k++] = 0;
            }
        }
        return reversedArray;

    }
}
