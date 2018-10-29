package com.ravi.GFG;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlyAlphabetsChecker {
    public static void main(String[] args) {
        String dataWithNoNum = "Ravi";
        String dataWithNum = "REavi1";
        System.out.println(isAlphabet(dataWithNoNum));
        System.out.println(isAlphabet(dataWithNum));

    }

    public static boolean isAlphabet(String input){
        String regex = "^[a-zA-Z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
