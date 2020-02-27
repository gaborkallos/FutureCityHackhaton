package com.penguins.jolly.hackaton.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;
import com.penguins.jolly.hackaton.service.SensorService;

public class showCase {
	
	public double startLat =46.247090;
	
	public double startLog = 20.138309;
	
	public double endLat = 46.261512;
	
	public double endLog = 20.151039;
	
//	Kezdopont:46.247090 20.138309
//	Vegpont:46.261512 20.151039
	
	@Autowired
	SensorRepository sensorRep;
	
	@Autowired
	SensorService ser;
	
	
	// 1. show case: bemutatjuk a teljes adatbazist
	
	@GetMapping(value =  "/")
	public void sensorFcn() {

		ser.initSensors();
		
		List<Sensor> sen = sensorRep.findAll();
		
		for (Sensor s : sen) {
			System.out.print("rep: " + s.getName());
		}
		//return sensorRep.findAll();

	}
	
	// 2. show case: bemutatunk egy basic route plannert
	
	// 3. show case: the same route planner with random data

}
