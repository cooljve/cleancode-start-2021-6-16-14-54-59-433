package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address from;
    private final Address to;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate(){
        if (isLocal()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameProvince() {
        return getProvince(this.to.getFromAddress()).equals(getProvince(this.from.getFromAddress()));
    }

    private boolean isLocal() {
        return isSameProvince() && isSameCity();
    }

    private boolean isSameCity() {
        return getCity(this.to.getFromAddress()).equals(getCity(this.from.getFromAddress()));
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
