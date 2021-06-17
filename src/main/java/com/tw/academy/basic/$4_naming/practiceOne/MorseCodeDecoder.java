package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    public static final String SPACE = " ";
    public static final String NON_MORSE_CODE = "null";
    public static final String EMPTY = "";
    public static final String CONTINUOUS_SPACE = "\\s{2,}";

    public static String decode(String input) {
        String[] words = input.split(CONTINUOUS_SPACE);
        StringBuilder decodeMorseCode = new StringBuilder();
        for (String word : words) {
            String [] letters = word.split(SPACE);
            for (String letter: letters) {
                decodeMorseCode.append(MorseCode.get(letter));
            }
            decodeMorseCode.append(SPACE);
        }
        return decodeMorseCode.toString().replaceAll(NON_MORSE_CODE, EMPTY).trim();
    }
}
