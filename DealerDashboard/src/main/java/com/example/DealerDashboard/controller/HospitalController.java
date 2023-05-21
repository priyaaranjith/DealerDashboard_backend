package com.example.DealerDashboard.controller;

import com.example.DealerDashboard.dto.HospitalDTO;
import com.example.DealerDashboard.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewhospitals")
    public List<HospitalDTO> hosOrder() {
        return hospitalService.hosOrder();
    }
}

