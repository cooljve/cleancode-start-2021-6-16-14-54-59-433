package com.tw.academy.basic.$5_data_clumps;

public class Buyer {
    private String name;
    private String phoneNumber;
    private String address;

    public Buyer(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String confirm() {
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.getName(), this.getPhoneNumber(), this.getAddress());
    }
}
