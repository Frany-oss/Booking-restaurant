package com.booking.bookingrestaurantapi.repositories;

import com.booking.bookingrestaurantapi.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    //@Override
    Optional<Restaurant> findById(Long id);
    Optional<Restaurant> findByName(String nameRestaurant);

    @Query("SELECT Rest FROM Restaurant Rest")
    List<Restaurant> findRestaurants();
}
