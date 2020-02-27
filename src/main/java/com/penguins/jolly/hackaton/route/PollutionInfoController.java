package com.penguins.jolly.hackaton.route;


import com.penguins.jolly.hackaton.model.End;
import com.penguins.jolly.hackaton.model.RouteInfo;
import com.penguins.jolly.hackaton.service.RoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pollution")
public class PollutionInfoController {

    @Autowired
    RoutingService routingService;

    @RequestMapping(method = RequestMethod.GET)
    public End pollution(){
        End end = routingService.getRoutePollutionInfoAPI();
        return end;
    }
}
