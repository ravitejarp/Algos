package com.ravi.algos;

public class ShellSortUnderstood {

    public static void main(String[] args) {
        ShellSortUnderstood shellSortUnderstood = new ShellSortUnderstood();
        int[] shellSort = shellSortUnderstood.shellSort(new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9}, 3);
        for (int i : shellSort) {
            System.out.print(i + "\t");
        }
    }

    public int[] shellSort(int[] shell, int inc) {
//        inc = shell.length/2;
        for (int i = 0; i < inc; i++) {
            for (int j = i; j + inc < shell.length; j += inc) {
                if (shell[j] > shell[j + inc]) {
                    int temp = shell[j];
                    shell[j] = shell[j + inc];
                    shell[j + inc] = temp;
                }
            }
            for (int k : shell) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }


        //Insertion sort
        for (int i = 1; i < shell.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (shell[j] > shell[j - 1]) {
                    break;
                } else {
                    int temp = shell[j];
                    shell[j] = shell[j - 1];
                    shell[j - 1] = temp;
                }
            }
        }

        return shell;
    }
}
