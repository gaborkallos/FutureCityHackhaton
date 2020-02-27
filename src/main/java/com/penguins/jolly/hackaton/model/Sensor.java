package com.penguins.jolly.hackaton.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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




	public Sensor(Long i, String tisza_lajos, double v, double v1, ArrayList<PollutionData> pollutionData) {
    }
}
