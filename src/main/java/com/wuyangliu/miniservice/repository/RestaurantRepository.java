package com.wuyangliu.miniservice.repository;

import com.wuyangliu.miniservice.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
  Restaurant findRestaurantById(Integer id);
  List<Restaurant> findRestaurantsByCity(String city);
  
}
