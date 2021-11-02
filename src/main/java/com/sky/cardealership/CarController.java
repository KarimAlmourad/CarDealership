package com.sky.cardealership;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/cars")
public class CarController {


    @Autowired
    private CarService carService;

    @GetMapping(value = "/test")
    public List<Car> test(){
        return Arrays.asList(new Car("123","Tesla","Model S", "White",20000,25000,true));
    }

    @GetMapping(value = "/")
    public List<Car> getAllCars(){
        return carService.findAll();
    }

    @GetMapping(value = "/getCarBrand/{brand}")
    public List<Car> getCarByBrand(String brand){
        return carService.findByBrand(brand);
    }







}
