package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;
    private Buyer buyer;

    public Order(int orderNumber, Buyer buyer) {
        this.orderNumber = orderNumber;
        this.buyer = buyer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public String confirm() {
        return getBuyer().confirm();
    }
}

