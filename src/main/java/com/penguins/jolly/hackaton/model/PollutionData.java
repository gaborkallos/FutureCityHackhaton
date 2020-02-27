package com.penguins.jolly.hackaton.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class PollutionData {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private LocalTime time;
    private int PM2;
    private int PM10;


}
