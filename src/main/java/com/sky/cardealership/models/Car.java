package com.sky.cardealership.models;

import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {

    @Id
    @Getter
    private String numberPlate;
    private String brand;
    private String model;
    private String colour;
    private int mileage;
    private double price;
    private boolean booked;
}
