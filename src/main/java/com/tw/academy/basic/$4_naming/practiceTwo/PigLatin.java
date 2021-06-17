package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    private static final String SUFFIX_STRING = "ay";
    private static final String WORD_SEPARATOR = " ";

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String sentence) {
        String[] punctuations = {".", ",", "-", ":", ";", "!", "?"};
        String[] words = sentence.split(WORD_SEPARATOR);
        char firstLetter;

        for (int i = 0; i < words.length; i++) {
            if (!isPunctuation(punctuations, words[i])) {
                firstLetter = words[i].charAt(0);
                words[i] = words[i].substring(1);
                words[i] = words[i].replace(words[i], words[i] + firstLetter + SUFFIX_STRING);
            }
        }

        return String.join(WORD_SEPARATOR, words);
    }

    private static boolean isPunctuation(String[] punctuations, String word) {
        for (String punctuation : punctuations) {
            if (word.contains(punctuation)) {
                return true;
            }
        }
        return false;
    }
}
