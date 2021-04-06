package com.booking.bookingrestaurantapi.repositories;

import com.booking.bookingrestaurantapi.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
}
