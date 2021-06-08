package com.wuyangliu.miniservice.controllers;

import com.wuyangliu.miniservice.model.Restaurant;
import com.wuyangliu.miniservice.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class restaurantController {
  @Autowired
  RestaurantRepository restaurantRepo;
  
  @PostMapping("/addRestaurant")
  public String addRestaurant(@RequestBody Restaurant restaurant) {
    restaurantRepo.save(restaurant);
    System.out.println(restaurant.toString());
    return "restaurant added";
  }
  
  @GetMapping("/findById")
  public Restaurant findById(@RequestParam Integer id) {
    Restaurant restaurant = restaurantRepo.findRestaurantById(id);
    System.out.println(restaurant.toString());
    return restaurant;
  }
  
  @GetMapping("/findByCity")
  public List<Restaurant> findByCity(@RequestParam String city) {
    List<Restaurant> restaurants = restaurantRepo.findRestaurantsByCity(city);
    System.out.println(restaurants.toString());
    return restaurants;
  }
}
