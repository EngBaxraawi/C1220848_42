package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public String insertOrder(@RequestBody Order order) {
        orderRepository.insertOrder(order);
        return "Order inserted successfully!";
    }

    @PutMapping
    public String updateOrder(@RequestBody Order order) {
        orderRepository.updateOrder(order);
        return "Order updated successfully!";
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }
}