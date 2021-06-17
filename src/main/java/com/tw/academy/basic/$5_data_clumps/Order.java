package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;
    private Buyer buyer;

    private String name;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public String getName() {
        return buyer.getName();
    }

    public void setName(String name) {
        this.buyer = new Buyer(name);
    }

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.setName(buyerName);
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.getName(), buyerPhoneNumber, buyerAddress);
    }
}

