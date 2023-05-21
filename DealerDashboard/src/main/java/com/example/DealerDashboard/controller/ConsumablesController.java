package com.example.DealerDashboard.controller;

import com.example.DealerDashboard.dto.ConsumablesDTO;
import com.example.DealerDashboard.service.ConsumablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumablesController {

    @Autowired
    private ConsumablesService consumablesService;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewtools")
    public List<ConsumablesDTO> allTools() {
        return consumablesService.allTools();
    }
}
