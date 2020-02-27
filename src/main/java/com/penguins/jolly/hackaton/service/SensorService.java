package com.penguins.jolly.hackaton.service;

import com.penguins.jolly.hackaton.model.PollutionData;
import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    private SensorRepository sensorRepository;

    @Autowired
    public void setSensorRepository(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void initSensors(){
        Sensor sensor = new Sensor();
        sensor.setAllData(1L, "Tisza Lajos", 46.251669, 20.144677);
        sensorRepository.save(sensor);
        sensor.setAllData(2L, "Kossuth Lajos", 46.255973, 20.148077);
        sensorRepository.save(sensor);
        sensor.setAllData(3L, "Kalvaria", 46.251669, 20.144677);
        sensorRepository.save(sensor);
        sensor.setAllData(4L, "Hetvezer", 46.258885, 20.143395);
        sensorRepository.save(sensor);
    }

    public Optional<Sensor> findById(Long id){
        return sensorRepository.findById(id);
    }

    public List<Sensor> getAll(){
        return sensorRepository.findAll();
    }
}
