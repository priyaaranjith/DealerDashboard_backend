package com.example.DealerDashboard.service;

import com.example.DealerDashboard.dto.DashboardDTO;
import com.example.DealerDashboard.entity.Dashboard;
import com.example.DealerDashboard.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private DashboardRepository dashboardRepository;

    @Override
    public List<DashboardDTO> viewDashboard() {
        List<Dashboard> dashboardEntities = dashboardRepository.findAll();
        List<DashboardDTO> dashboardDTOs = new ArrayList<>();

        for (Dashboard dashboard : dashboardEntities) {
            DashboardDTO dashboardDTO = convertToDTO(dashboard);
            dashboardDTOs.add(dashboardDTO);
        }

        return dashboardDTOs;
    }

    private DashboardDTO convertToDTO(Dashboard dashboard) {
        DashboardDTO dashboardDTO = new DashboardDTO();
        dashboardDTO.setId(dashboard.getId());
        dashboardDTO.setDate(dashboard.getDate());
        dashboardDTO.setTotal_procedures(dashboard.getTotal_procedures());
        dashboardDTO.setTotal_order(dashboard.getTotal_order());
        dashboardDTO.setReturn_pending(dashboard.getReturn_pending());
        dashboardDTO.setPercentage(dashboard.getPercentage());

        return dashboardDTO;
    }
}
