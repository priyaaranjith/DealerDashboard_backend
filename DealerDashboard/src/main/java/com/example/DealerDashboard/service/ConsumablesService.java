package com.example.DealerDashboard.service;

import com.example.DealerDashboard.dto.ConsumablesDTO;
import com.example.DealerDashboard.entity.Consumables;
import com.example.DealerDashboard.entity.Dashboard;

import java.util.List;

public interface ConsumablesService {

    List<ConsumablesDTO> allTools();
}
