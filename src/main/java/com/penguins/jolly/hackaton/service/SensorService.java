package com.penguins.jolly.hackaton.service;

import com.opencsv.CSVReader;
import com.penguins.jolly.hackaton.PollutionData;
import com.penguins.jolly.hackaton.model.Sensor;
import com.penguins.jolly.hackaton.repository.PollutionRepository;
import com.penguins.jolly.hackaton.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    private SensorRepository sensorRepository;

    private PollutionRepository polRep;

    @Autowired
    public void setPolRep(PollutionRepository polRep) {
        this.polRep = polRep;
    }

    @Autowired
    public void setSensorRepository(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void initSensors() {
        Sensor sensor = new Sensor();
        sensor.setAllData(1L, "Tisza Lajos", 46.251669, 20.144677);
        sensorRepository.save(sensor);
        sensor.setAllData(2L, "Kossuth Lajos", 46.255973, 20.148077);
        sensorRepository.save(sensor);
        sensor.setAllData(3L, "Kalvaria", 46.251669, 20.144677);
        sensorRepository.save(sensor);
        sensor.setAllData(4L, "Hetvezer", 46.258885, 20.143395);
        sensorRepository.save(sensor);
    }

    public Optional<Sensor> findById(Long id) {
        return sensorRepository.findById(id);
    }

    public List<Sensor> getAll() {
        return sensorRepository.findAll();
    }

    public void savePollutionDataFromCsv() {

        try {
            CSVReader reader = new CSVReader(new FileReader("/home/gabor/FutureCityHackhaton/src/main/java/com/penguins/jolly/hackaton/service/pollData.csv"), ';', '"', 1);

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    //Verifying the read data here
                    PollutionData polData = new PollutionData();
                    Optional<Sensor> senTest = sensorRepository.getById(Long.valueOf(nextLine[0]));
                    System.out.println(nextLine[0].toString());
                    polData.setAllData(senTest.get(), nextLine[3], nextLine[4], nextLine[1], nextLine[2]);
                    polRep.save(polData);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
