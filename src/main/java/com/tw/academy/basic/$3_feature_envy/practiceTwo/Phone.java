package com.tw.academy.basic.$3_feature_envy.practiceTwo;

public class Phone {
    private final String unformattedNumber;
    public Phone(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }
    private String getAreaCode() {
        return unformattedNumber.substring(0,3);
    }
    private String getPrefix() {
        return unformattedNumber.substring(3,6);
    }
    private String getNumber() {
        return unformattedNumber.substring(6,10);
    }

    public String getMobilePhoneNumber() {
        return "(" +
                this.getAreaCode() + ") " +
                this.getPrefix() + "-" +
                this.getNumber();
    }
}
