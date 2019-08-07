package com.ravi.com.ravi.generalProblems;

public class RunLengthEncodingDecoding {

    public static void main(String[] args) {
        RunLengthEncodingDecoding runLengthEncodingDecoding = new RunLengthEncodingDecoding();
        String abbccc = runLengthEncodingDecoding.runlengthEncoding("ABBCCCDDDDFGGGGGGGGGGGG");
        System.out.println(abbccc);
        System.out.println(runLengthEncodingDecoding.decodedRunLength(abbccc));
    }

    public String runlengthEncoding(String input) {
        if (input == null || "".equalsIgnoreCase(input)) {
            return input;
        }
        StringBuilder encodedString = new StringBuilder();
        String next = "";
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (next.equalsIgnoreCase("")) {
                next = input.charAt(i) + "";
                counter++;
            } else {
                if (next.equalsIgnoreCase(input.charAt(i) + "")) {
                    counter++;
                } else {
                    encodedString.append(counter).append(next);
                    next = input.charAt(i) + "";
                    counter = 1;
                }
            }
        }
        encodedString.append(counter).append(next);
        return encodedString.toString();
    }

    public String decodedRunLength(String encodedString) {
        if (encodedString == null || "".equalsIgnoreCase(encodedString)) {
            return encodedString;
        }
        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < encodedString.length(); i = i + 2) {
            Integer count = Integer.parseInt(encodedString.charAt(i) + "");
            while (Character.isDigit(encodedString.charAt(i + 1))) {
                i = i + 1;
                count = Integer.parseInt(encodedString.charAt(i) + encodedString.charAt(i + 1) + "");
            }
            for (int j = 0; j < count; j++) {
                decodedString.append(encodedString.charAt(i + 1));
            }
        }
        return decodedString.toString();

    }

}
