package com.ravi.algos;

import java.util.Scanner;

public class ArrayImpl {
    static int[] playerNums;
    static int index = 0;
    public static void main(String[] args) {
        boolean isExit = true;

        ArrayImpl array = new ArrayImpl();
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Create New Array");
            System.out.println("2.Insert an element");
            System.out.println("3.Delete an element");
            System.out.println("4.Search an element");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()) {
                case "1":
                    System.out.println("Enter the size of the array");
                    String size = scanner.next();
                    playerNums=new int[Integer.parseInt(size)];
                    System.out.println("No dups are allowed");
                    break;
                case "2":
                    System.out.println("Enter your input:");
                    String inputVal = scanner.next();
                    array.insertIntoArray(Integer.parseInt(inputVal));
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.exit(1);
                    isExit = false;
            }

        } while (isExit);

    }

    private void insertIntoArray(int inputVal) {
        if(index<playerNums.length)
        {
            playerNums[index] = inputVal;
            System.out.println(inputVal+" has been inserted at index "+index);
            index++;
        }else {
            System.out.println("Size exceeded");
        }

    }

    private int searchAnArray(int inputToSearch) {

        return -1;
    }

    private boolean deleteAnElement(int elementVal) {

        return false;
    }

}
