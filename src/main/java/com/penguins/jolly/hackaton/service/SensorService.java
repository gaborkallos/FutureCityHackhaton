package com.penguins.jolly.hackaton.service;

import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SensorService {

    private SensorRepository sensorRepository;

    @Autowired
    public void setSensorRepository(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void initSensors(){
        Sensor sensor;
        sensor = Sensor.builder()
                .name("Tisza Lajos")
                .latitude(46.251669)
                .longitude(20.144677)
                .build();
        sensorRepository.save(sensor);
        sensor = Sensor.builder()
                .name("Kossuth Lajos")
                .latitude(46.255973)
                .longitude(20.148077)
                .build();
        sensorRepository.save(sensor);
        sensor = Sensor.builder()
                .name("Kalvaria")
                .latitude(46.251953)
                .longitude(20.138452)
                .build();
        sensorRepository.save(sensor);
        sensor = Sensor.builder()
                .name("Hetvezer")
                .latitude(46.258885)
                .longitude(20.143395)
                .build();
        sensorRepository.save(sensor);

    }
}
