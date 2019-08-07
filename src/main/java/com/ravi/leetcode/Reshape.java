package com.ravi.leetcode;

import java.util.Arrays;

public class Reshape {

    public static void main(String[] args) {
        Reshape reshape = new Reshape();
        int[][] ints = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(reshape.matrixReshape(ints, 4, 1)));
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int[][] trans = new int[r][c];
        int rowCount = 0;
        int colCount = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i].length;
            System.out.println("Total" + total);
            int val = r * c;
            System.out.println("Val" + val);
            if (val > total) {
                return nums;
            }
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(rowCount);
                System.out.println(colCount);
                trans[rowCount][colCount] = nums[i][j];
                colCount = colCount + 1;
                if (colCount >= c) {
                    rowCount = rowCount + 1;
                    if (rowCount >= r) {
                        return nums;
                    }
                    colCount = 0;
                }
                System.out.println(rowCount);
                System.out.println(colCount);

            }
        }
        return trans;
    }
}
