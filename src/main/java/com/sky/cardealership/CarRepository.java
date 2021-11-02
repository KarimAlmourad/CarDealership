package com.sky.cardealership;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarRepository extends MongoRepository<Car,String> {

    List<Car> findByBrand(String brand);



}
