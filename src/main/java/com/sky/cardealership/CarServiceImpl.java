package com.sky.cardealership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> findByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }

    @Override
    public List<Car> findByBookedFalse() {
        return carRepository.findByBookedFalse();
    }
}
