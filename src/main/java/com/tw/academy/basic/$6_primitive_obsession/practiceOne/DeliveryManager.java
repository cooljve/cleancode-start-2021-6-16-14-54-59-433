package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address from;
    private final Address to;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate() {
        if (isLocal()) {
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameProvince() {
        return this.to.getProvince().equals(this.from.getProvince());
    }

    private boolean isLocal() {
        return isSameProvince() && isSameCity();
    }

    private boolean isSameCity() {
        return this.to.getCity().equals(this.from.getCity());
    }

}
