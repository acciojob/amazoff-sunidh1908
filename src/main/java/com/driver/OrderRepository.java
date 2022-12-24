package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository

public class OrderRepository {

    HashMap<String,Order> listOfOrders = new HashMap<>();
    HashMap<String,DeliveryPartner> listOfPartners = new HashMap<>();
    HashMap<String, List<String>> orderPartnerPairing = new HashMap<>();

    public void addOrder(Order order){
        listOfOrders.put(order.getId(),order);
    }

    public void addPartner(String PartnerID,DeliveryPartner deliveryPartner){
        listOfPartners.put(PartnerID,deliveryPartner);
    }

    public void addOrderPartnerPair(String OrderID, String PartnerID){
        if(orderPartnerPairing.containsKey(PartnerID)){
            orderPartnerPairing.get(PartnerID).add(OrderID);
        }
        else{
            List<String> orders = new ArrayList<>();
            orders.add(OrderID);
            orderPartnerPairing.put(PartnerID,orders);
        }
    }

    public Order getOrderById(String OrderID){
        return listOfOrders.get(OrderID);
    }

    public DeliveryPartner getPartnerById(String PartnerID){
        return listOfPartners.get(PartnerID);
    }

    public int getOrderCountByPartnerId(String PartnerID){
        return orderPartnerPairing.get(PartnerID).size();
    }

    public List<String> getOrdersByPartnerId(String PartnerID){
        return orderPartnerPairing.get(PartnerID);
    }

    public List<String> getAllOrders(){
        List<String> orders = new ArrayList<>();
        for(Order order : listOfOrders.values()){
            orders.add(order.getId());
        }
        return orders;
    }

    public int getCountOfUnassignedOrders(){
        int count = 0;
        for(Order order : listOfOrders.values()){
            if(!orderPartnerPairing.containsKey(order)){
                count++;
            }
        }
        return count;
    }

    public int getOrdersLeftAfterGivenTimeByPartnerId(String time, String PartnerID){
        return 0;
    }

    public String getLastDeliveryTimeByPartnerId(String PartnerID){
        return null;
    }

    public void deletePartnerById(String PartnerID){

    }

    public void deleteOrderById(String OrderID){

    }
}
