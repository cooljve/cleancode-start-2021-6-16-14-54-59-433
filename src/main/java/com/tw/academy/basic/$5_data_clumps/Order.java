package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;
    private Buyer buyer;



    public String getAddress() {
        return this.buyer.getAddress();
    }

    public void setAddress(String address) {
        this.buyer.setAddress(address);
    }

    public String getPhoneNumber() {
        return buyer.getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.buyer.setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return buyer.getName();
    }

    public void setName(String name) {
        this.buyer = new Buyer(name);
    }

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.setName(buyerName);
        this.setPhoneNumber(buyerPhoneNumber);
        this.setAddress(buyerAddress);
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.getName(), this.getPhoneNumber(), this.getAddress());
    }
}

