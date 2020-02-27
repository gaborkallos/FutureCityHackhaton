package com.penguins.jolly.hackaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;

public class ApiController {
	@Autowired
	SensorRepository sensorRep;

	@GetMapping(value = "/")
	public List<Sensor> sensorFcn() {

		return sensorRep.findAll();

	}
}
