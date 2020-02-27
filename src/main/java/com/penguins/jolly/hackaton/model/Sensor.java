package com.penguins.jolly.hackaton.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Sensor {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    @OneToMany
    private List<PollutionData> pollutionData;


}
