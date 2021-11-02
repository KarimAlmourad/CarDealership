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
    private int mileage;
    private double price;
    private boolean booked;

    public Car(String numberPlate, String brand, String model, String colour, int mileage, double price, boolean booked) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.mileage = mileage;
        this.price = price;
        this.booked = booked;
    }

    public Car(String brand) {
        this.brand = brand;
    }
}
