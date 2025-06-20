package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertOrder(Order order) {
        String sql = "INSERT INTO orders(orderName, price) VALUES (?, ?)";
        return jdbcTemplate.update(sql, order.getOrderName(), order.getPrice());
    }

    public int updateOrder(Order order) {
        String sql = "UPDATE orders SET orderName = ?, price = ? WHERE orderID = ?";
        return jdbcTemplate.update(sql, order.getOrderName(), order.getPrice(), order.getOrderID());
    }

    public List<Order> getAllOrders() {
        String sql = "SELECT * FROM orders";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
    }
}