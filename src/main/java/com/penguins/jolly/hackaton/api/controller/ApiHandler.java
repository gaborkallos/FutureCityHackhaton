package com.penguins.jolly.hackaton.api.controller;

import com.penguins.jolly.hackaton.model.End;
import com.penguins.jolly.hackaton.model.RouteInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiHandler {

    private static final String key = "Xttvaj39AoZ4Cjr2Tc_F7bFP7HZAK2SoqSmDXPc8nw8";

    public End RouteRequest(){
        String url = "https://route.ls.hereapi.com/routing/7.2/calculateroute.json?apiKey=Xttvaj39AoZ4Cjr2Tc_F7bFP7HZAK2SoqSmDXPc8nw8&waypoint0=geo!52.5,13.4&waypoint1=geo!52.5,13.45&mode=fastest;car;traffic:disabled";
        RestTemplate restTemplate = new RestTemplate();
        End end = restTemplate.getForObject(url, End.class);
        return end;

    }


}
