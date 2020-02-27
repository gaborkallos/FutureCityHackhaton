package com.penguins.jolly.hackaton.repository;

import com.penguins.jolly.hackaton.PollutionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollutionRepository extends JpaRepository<PollutionData, Long> {
}
