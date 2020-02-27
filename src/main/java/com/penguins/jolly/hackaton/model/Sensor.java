package com.penguins.jolly.hackaton.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    @OneToMany
    private List<PollutionData> pollutionData;

    public void setAllData(Long id, String name, double latitude, double longitude){
      this.id = id;
      this.name = name;
      this.latitude = latitude;
      this.longitude = longitude;

    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getLatitude() {
        return latitude;
    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public List<PollutionData> getPollutionData() {
        return pollutionData;
    }


    public void setPollutionData(List<PollutionData> pollutionData) {
        this.pollutionData = pollutionData;
    }

    public Sensor() {
    }


}
