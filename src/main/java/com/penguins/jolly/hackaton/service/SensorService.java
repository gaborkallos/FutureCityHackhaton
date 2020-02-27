package com.penguins.jolly.hackaton.service;

import com.penguins.jolly.hackaton.model.PollutionData;
import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class SensorService {

    private SensorRepository sensorRepository;

    @Autowired
    public void setSensorRepository(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void initSensors(){
        Sensor sensor1 = new Sensor(1L, "Tisza Lajos", 46.251669, 20.144677, new ArrayList<PollutionData>());
        Sensor sensor2 = new Sensor(2L, "Kossuth Lajos", 46.255973, 20.148077, new ArrayList<PollutionData>());
        Sensor sensor3 = new Sensor(3L, "Kalvaria", 46.251669, 20.144677, new ArrayList<PollutionData>());
        Sensor sensor4 = new Sensor(4L, "Hetvezer", 46.258885, 20.143395, new ArrayList<PollutionData>());
        sensorRepository.save(sensor1);
        sensorRepository.save(sensor2);
        sensorRepository.save(sensor3);
        sensorRepository.save(sensor4);


    }
}
