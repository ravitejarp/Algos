package com.ravi.algos;

public class ShellSort {
    public static int[] shellSort(int[] input, int increment) {
        for (int i = 0; i < increment; i++) {
            for (int j = i; j < input.length; j = j + increment) {
                for (int k = j; k >= 0; k = k - increment) {
                    if (k - increment >= 0 && input[k] < input[k - increment]) {
                        int temp = input[k];
                        input[k] = input[k - increment];
                        input[k - increment] = temp;
                    } else {
                        break;
                    }
                }
            }
            display(input);
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j >= 0 && j < input.length; j--) {
                if (input[i] > input[j]) {
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                } else {
                    break;
                }
            }
        }
        return input;

    }

    private static void display(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display(ShellSort.shellSort(new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9}, 3));
    }
}
