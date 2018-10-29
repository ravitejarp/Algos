package com.ravi.GFG;

public class NthElement {
    public static void main(String[] args) {
        System.out.println(getNthEle(3));
        System.out.println(getNthEle(5));

    }
    private static int getNthEle(int input){
        return (input+(input-1)*input)/2;
    }
}
