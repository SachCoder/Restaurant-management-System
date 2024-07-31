package com.sachcoder.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sachcoder.entities.FoodItem;
import com.sachcoder.exception.NotFoundException;
import com.sachcoder.repository.IFoodItemRepo;

@Service
public class FoodItemService {
    private final IFoodItemRepo foodItemRepo;

    public FoodItemService(IFoodItemRepo foodItemRepository) {
        this.foodItemRepo = foodItemRepository;
    }

    public FoodItem createFoodItem(FoodItem foodItem) {
//        return FoodItem.save(foodItem);
    	return null;
    }

    public FoodItem getFoodItemById(Long id) {
        return foodItemRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("FoodItem not found"));
    }

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepo.findAll();
    }

    public void deleteFoodItem(Long id) {
        foodItemRepo.deleteById(id);
    }

	
}

