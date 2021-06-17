package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address from;
    private final Address to;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate(){
        if (getProvince(this.to.getFromAddress()).equals(getProvince(this.from.getFromAddress())) && getCity(this.to.getFromAddress()).equals(getCity(this.from.getFromAddress()))){
            return DeliverCenter.LOCAL;
        }
        if (getProvince(this.to.getFromAddress()).equals(getProvince(this.from.getFromAddress()))) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
