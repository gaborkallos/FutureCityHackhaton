package com.penguins.jolly.hackaton.repository;

import com.penguins.jolly.hackaton.model.Sensor;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

	
}
