package com.penguins.jolly.hackaton.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Sensor {

    @Id
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    @OneToMany
    private List<PollutionData> pollutionData;


    public Sensor(Long i, String tisza_lajos, double v, double v1, ArrayList<PollutionData> pollutionData) {
    }
}
