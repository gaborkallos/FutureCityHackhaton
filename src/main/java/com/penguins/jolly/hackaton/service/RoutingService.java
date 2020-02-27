package com.penguins.jolly.hackaton.service;


import com.penguins.jolly.hackaton.api.controller.ApiHandler;
import com.penguins.jolly.hackaton.model.End;
import com.penguins.jolly.hackaton.model.RouteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class RoutingService {

    @Autowired
    private ApiHandler apiHandler;

    public End getRouteInfoAPI(){
        End routeInformation = apiHandler.RouteRequest();
        return routeInformation;
    }


}
