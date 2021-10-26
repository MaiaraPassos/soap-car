package com.example.soapcar.service;

import com.example.soapcar.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    private static final Map<String, Car> cars = new HashMap<>();

    @PostConstruct
    public void inizialize() {

        Car opel = new Car();
        opel.setBrand("Opel");
        opel.setPlateNumber(123456);
        opel.setPrice(10000);

        Car alfaRomeu = new Car();
        opel.setBrand("Alfa Romeu");
        opel.setPlateNumber(123457);
        opel.setPrice(13000);

        Car Mercedes = new Car();
        opel.setBrand("Kia");
        opel.setPlateNumber(123458);
        opel.setPrice(12000);

        cars.put(opel.getBrand(), opel);
        cars.put(alfaRomeu.getBrand(), alfaRomeu);
        cars.put(Mercedes.getBrand(), Mercedes);
    }

    public Car getCars(String brand) {
        System.out.println(brand);
        return cars.get(brand);
    }
}