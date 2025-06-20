package com.example.demo.model;

public class Order {
    private int orderID;
    private String orderName;
    private double price;

    public int getOrderID() { return orderID; }
    public void setOrderID(int orderID) { this.orderID = orderID; }

    public String getOrderName() { return orderName; }
    public void setOrderName(String orderName) { this.orderName = orderName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}