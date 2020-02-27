package com.penguins.jolly.hackaton.controller;

import java.util.ArrayList;
import java.util.List;

import com.penguins.jolly.hackaton.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;

public class ApiController {

	SensorService senserv;

	@Autowired
	public void setSenserv(SensorService senserv) {
		this.senserv = senserv;
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Sensor>> getSensors() {
		List<Sensor> sensors = new ArrayList<>();
		return new ResponseEntity<>(sensors, HttpStatus.OK);
	}
}
