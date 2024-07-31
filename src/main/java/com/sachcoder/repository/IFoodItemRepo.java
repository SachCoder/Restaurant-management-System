package com.sachcoder.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sachcoder.entities.FoodItem;

public interface IFoodItemRepo extends JpaRepository<FoodItem, Long> {
}
