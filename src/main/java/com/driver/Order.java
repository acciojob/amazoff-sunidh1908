package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        this.id = id;
        this.deliveryTime = convertedTime(deliveryTime);
    }

    public String getId() {
        return id;
    }

    public int convertedTime(String deliveryTime){
        int HH = Integer.valueOf(deliveryTime.substring(0, 2));
        int MM = Integer.valueOf(deliveryTime.substring(3, 5));
        int convertedTime = HH*60 + MM;
        return convertedTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
