package com.example.DealerDashboard.controller;

import com.example.DealerDashboard.dto.DashboardDTO;
import com.example.DealerDashboard.entity.Consumables;
import com.example.DealerDashboard.entity.Hospitals;
import com.example.DealerDashboard.service.ConsumablesService;
import com.example.DealerDashboard.service.DashboardService;
import com.example.DealerDashboard.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewtotal")
    public List<DashboardDTO> viewDashboard() {
        return dashboardService.viewDashboard();
    }
}