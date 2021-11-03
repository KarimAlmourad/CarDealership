package com.sky.cardealership.repository;

import com.sky.cardealership.models.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarRepository extends MongoRepository<Car,String> {

    List<Car> findByBrand(String brand);

    List<Car> findByBookedFalse();



}
