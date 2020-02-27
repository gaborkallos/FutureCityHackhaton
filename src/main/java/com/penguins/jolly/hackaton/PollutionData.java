package com.penguins.jolly.hackaton;

import com.penguins.jolly.hackaton.model.Sensor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.zip.DataFormatException;


@Entity
public class PollutionData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Sensor sensor;
    private LocalDate date;
    private LocalTime time;
    private int PM2;
    private int PM10;

    public void setAllData(Sensor sensor, String date, String time, String PM2, String PM10){
    	this.sensor = sensor;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    	this.date = LocalDate.parse(date, dtf);
    	this.time = LocalTime.parse(time, timeFormatter);
    	this.PM2 = Integer.getInteger(PM2);
    	this.PM10 = Integer.getInteger(PM10);
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getPM2() {
        return PM2;
    }

    public void setPM2(int pM2) {
        PM2 = pM2;
    }

    public int getPM10() {
        return PM10;
    }

    public void setPM10(int pM10) {
        PM10 = pM10;
    }


}
