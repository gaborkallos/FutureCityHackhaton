package com.penguins.jolly.hackaton.repository;

import com.penguins.jolly.hackaton.model.Sensor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

    public default Optional<Sensor> getById(long id){
        return findById(id);
    }
	
}
