package com.food.listener;

import com.food.enums.Status;
import com.food.model.Order;
import com.food.model.Restaurant;
import com.food.repository.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RestaurantSuccessfulEventListener {

    @Autowired
    RestaurantRepository restaurantRepository;


    @KafkaListener(topics = "payment-successful", groupId = "restaurants_1")
    public void consume(Order order){
        log.info(String.format("Message received -> %s", order));
        Restaurant restaurant = new Restaurant();
        restaurant.setStatus(Status.RECEIVED);
        restaurantRepository.save(restaurant);
        //make Restaurant through Restaurant gateway, currently make it Successful
        restaurantRepository.save(restaurant);
        //TODO: SEND PUSH NOTIFICATION TO UI SO THAT RESTAURANT WILL SEE NEW JOB, CAN ACCEPT OR DECLINE
    }
}
