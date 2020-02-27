package com.penguins.jolly.hackaton.repository;

import com.penguins.jolly.hackaton.model.PollutionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollutionRepository extends JpaRepository<PollutionData, Long> {
}
