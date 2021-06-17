package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;
    private Buyer buyer;

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.setBuyer(buyerName, buyerPhoneNumber, buyerAddress);
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.buyer = new Buyer(buyerName, buyerPhoneNumber, buyerAddress);
    }

    public String confirm() {
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.getBuyer().getName(), this.getBuyer().getPhoneNumber(), this.getBuyer().getAddress());
    }
}

