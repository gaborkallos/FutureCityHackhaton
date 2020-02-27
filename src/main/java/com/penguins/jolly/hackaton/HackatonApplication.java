package com.penguins.jolly.hackaton;

import com.penguins.jolly.hackaton.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackatonApplication {

	SensorService sensorService;

	@Autowired
	public void setSensorService(SensorService sensorService) {
		this.sensorService = sensorService;
		sensorService.initSensors();
	}

	public static void main(String[] args) {
		SpringApplication.run(HackatonApplication.class, args);
	}

}
