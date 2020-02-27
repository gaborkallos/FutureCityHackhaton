package com.penguins.jolly.hackaton.repository;

import com.penguins.jolly.hackaton.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

}
