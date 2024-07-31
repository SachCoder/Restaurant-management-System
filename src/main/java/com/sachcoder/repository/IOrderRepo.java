package com.sachcoder.repository; 


import org.springframework.data.jpa.repository.JpaRepository;

import com.sachcoder.entities.Order;

public interface IOrderRepo extends JpaRepository<Order, Long> {
}
