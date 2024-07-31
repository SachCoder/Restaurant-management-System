package com.sachcoder.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sachcoder.entities.Order;
import com.sachcoder.exception.NotFoundException;
import com.sachcoder.repository.IOrderRepo;

@Service
public class OrderService {
    private final IOrderRepo orderRepo;

    public OrderService(IOrderRepo orderRepository) {
        this.orderRepo = orderRepository;
    }

    public Order createOrder(Order order) {
        order.setDateTime(LocalDateTime.now());
        return orderRepo.save(order);
    }

    public Order getOrderById(Long id) {
        return orderRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Order not found"));
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}
