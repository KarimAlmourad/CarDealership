package com.sky.cardealership;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    List<Car> findByBrand(String brand);

    List<Car> findByBookedFalse();
}
