package com.penguins.jolly.hackaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;
import com.penguins.jolly.hackaton.service.SensorService;

public class ApiController {
	@Autowired
	SensorRepository sensorRep;
	
	@Autowired
	SensorService ser;

	@GetMapping(value =  "/")
	public void sensorFcn() {

		ser.initSensors();
		
		List<Sensor> sen = sensorRep.findAll();
		
		for (Sensor s : sen) {
			System.out.print("rep: " + s.getName());
		}
		//return sensorRep.findAll();

	}
}
