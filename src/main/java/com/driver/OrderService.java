package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component

public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void addOrder(Order order){
        orderRepository.addOrder(order);
    }

    public void addPartner(String PartnerID,DeliveryPartner deliveryPartner){
        orderRepository.addPartner(PartnerID,deliveryPartner);
    }

    public void addOrderPartnerPair(String OrderID, String PartnerID){
        orderRepository.addOrderPartnerPair(OrderID,PartnerID);
    }

    public Order getOrderById(String OrderID){
        return orderRepository.getOrderById(OrderID);
    }

    public DeliveryPartner getPartnerById(String PartnerID){
        return orderRepository.getPartnerById(PartnerID);
    }

    public int getOrderCountByPartnerId(String PartnerID){
        return orderRepository.getOrderCountByPartnerId(PartnerID);
    }

    public List<String> getOrdersByPartnerId(String PartnerID){
        return orderRepository.getOrdersByPartnerId(PartnerID);
    }

    public List<String> getAllOrders(){
        return orderRepository.getAllOrders();
    }

    public int getCountOfUnassignedOrders(){
        return orderRepository.getCountOfUnassignedOrders();
    }

    public int getOrdersLeftAfterGivenTimeByPartnerId(String time, String PartnerID){
        return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time,PartnerID);
    }

    public String getLastDeliveryTimeByPartnerId(String PartnerID){
        return orderRepository.getLastDeliveryTimeByPartnerId(PartnerID);
    }

    public void deletePartnerById(String PartnerID){
        orderRepository.deletePartnerById(PartnerID);
    }

    public void deleteOrderById(String OrderID){
        orderRepository.deleteOrderById(OrderID);
    }
}
