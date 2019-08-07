package com.ravi.ciq;

public class UniqueCharInString {

    public static void main(String[] args) {
        UniqueCharInString uniqueCharInString = new UniqueCharInString();
        System.out.println("Ravi:" + uniqueCharInString.isStringUnique("Ravi"));
        System.out.println("RaviTeja:" + uniqueCharInString.isStringUnique("RaviTeja"));
        System.out.println("Pavann:" + uniqueCharInString.isStringUnique("Pavann"));

    }

    public boolean isStringUnique(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (i != input.indexOf(input.charAt(i)) || input.lastIndexOf(input.charAt(i)) != i) {
                return false;
            }
        }
        return true;
    }
}
