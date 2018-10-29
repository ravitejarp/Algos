package com.ravi.Hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaImplementation {
    public static void main(String[] args) {
        System.out.println(encryptTheInput("GeeksForGeeks"));

    }

    private static String encryptTheInput(String input){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-384");
            byte[] digest = messageDigest.digest(input.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest);
            String hashText = bigInteger.toString(16);
            while (hashText.length()<32){
                hashText += "0";
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Cause:"+e.getCause());
        }
        return "";
    }
}
