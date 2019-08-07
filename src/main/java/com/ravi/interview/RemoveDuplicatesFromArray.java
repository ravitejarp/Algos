package com.ravi.interview;

import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 3, 2, 2, 4, 5, 5, 6});
        Scanner sc = new Scanner(System.in);
//        sc.n
    }

    static void removeDuplicates(int[] arr) {
        int[] non_dupl = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i] - 1;
            if (non_dupl[val] == 1) {
                System.out.println("Duplicate:" + arr[i]);
                continue;
            }
            non_dupl[val] = 1;
        }

        for (int i = 0; i < non_dupl.length; i++) {
            if (non_dupl[i] == 0) {
                int val = i + 1;
                System.out.println("Missed:" + val);
            } else {
                System.out.println(i + 1);
            }
        }


    }
}
