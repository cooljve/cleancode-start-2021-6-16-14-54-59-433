package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    private static final String SUFFIX_STRING = "ay";
    private static final String WORD_SEPARATOR = " ";

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String str) {
        String[] punctuations = {".", ",", "-", ":", ";", "!", "?"};
        String[] words = str.split(WORD_SEPARATOR);
        char firstLetter;
        boolean isNotPunctuation = true;

        for (int i = 0; i < words.length; i++) {
            for (String punctuation : punctuations) {
                if (words[i].contains(punctuation)) {
                    isNotPunctuation = false;
                    break;
                }
            }

            if (isNotPunctuation) {
                firstLetter = words[i].charAt(0);
                words[i] = words[i].substring(1);
                words[i] = words[i].replace(words[i], words[i] + firstLetter + SUFFIX_STRING);
            }
            isNotPunctuation = true;
        }

        return String.join(WORD_SEPARATOR, words);
    }
}
