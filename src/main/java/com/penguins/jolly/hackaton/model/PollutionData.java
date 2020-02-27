package com.penguins.jolly.hackaton.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class PollutionData {

    @Id
    private Long id;
    private Date date;
    private Time time;
    private int PM2;
    private int PM10;


}
