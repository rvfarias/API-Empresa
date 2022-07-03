package com.APIEmpresa.APIEmpresa.service;

import com.APIEmpresa.APIEmpresa.models.WorkingDay;
import com.APIEmpresa.APIEmpresa.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyService {

    @Autowired
    JourneyRepository journeyRepository;

    public WorkingDay saveJourney(WorkingDay workingDay){
        return journeyRepository.save(workingDay);
    }
}
