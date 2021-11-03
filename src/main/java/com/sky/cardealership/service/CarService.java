package com.sky.cardealership.service;

import com.sky.cardealership.models.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    List<Car> findByBrand(String brand);

    List<Car> findByBookedFalse();
}
