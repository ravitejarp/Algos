package com.ravi.com.ravi.generalProblems;

public class AddingDigitByDigit {
    public static int sumOfDigits(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        int sum = 0;
        int i = 0;

        while (num1 != 0 || num2 != 0) {
            int val1 = num1 % 10;
            val1 += num2 % 10;
            sum += val1;
            num1 = num1 / 10;
            num2 = num2 / 10;
            sum *= Math.pow(10, i++);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(AddingDigitByDigit.sumOfDigits(10, 101));
    }
}
