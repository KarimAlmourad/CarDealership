package com.sky.cardealership;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Car {

    @Id
    private String numberPlate;
    private String brand;
    private String model;
    private String colour;
    private int milage;
    private double price;

    public Car(String numberPlate, String brand, String model, String colour, int milage, double price) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.milage = milage;
        this.price = price;
    }
}
