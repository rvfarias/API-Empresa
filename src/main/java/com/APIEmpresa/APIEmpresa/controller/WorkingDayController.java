package com.APIEmpresa.APIEmpresa.controller;

import com.APIEmpresa.APIEmpresa.models.WorkingDay;
import com.APIEmpresa.APIEmpresa.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journey")
public class WorkingDayController {
    @Autowired
    JourneyService journeyService;

    @PostMapping
    public WorkingDay createJourney(@RequestBody WorkingDay workingDay){

        return journeyService.saveJourney(workingDay);
    }
}
