package com.example.soapcar.controller;

import com.example.soapcar.model.CarRequest;
import com.example.soapcar.model.CarResponse;
import com.example.soapcar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    @Autowired
    private CarService carService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "carRequest")
    @ResponsePayload
    public CarResponse carRequest(@RequestPayload CarRequest request) {
        CarResponse response = new CarResponse();
        response.setCar(carService.getCars(request.getBrand()));
        return response;
    }
}