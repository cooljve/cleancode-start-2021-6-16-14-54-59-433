package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    public static final String SPACE = " ";
    public static final String NULL = "null";
    public static final String EMPTY = "";

    public static String decode(String input) {
        String continuousSpace = "\\s{2,}";
        String[] words = input.split(continuousSpace);
        StringBuilder decodeMorseCode = new StringBuilder();
        for (String word : words) {
            String [] letters = word.split(SPACE);
            for (String letter: letters) {
                decodeMorseCode.append(MorseCode.get(letter));
            }
            decodeMorseCode.append(SPACE);
        }
        return decodeMorseCode.toString().replaceAll(NULL, EMPTY).trim();
    }
}
