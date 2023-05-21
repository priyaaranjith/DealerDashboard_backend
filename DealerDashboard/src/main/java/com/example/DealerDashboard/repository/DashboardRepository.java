package com.example.DealerDashboard.repository;

import com.example.DealerDashboard.dto.DashboardDTO;
import com.example.DealerDashboard.entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DashboardRepository extends JpaRepository<Dashboard, Integer> {

    @Query(value = "SELECT * FROM `dashboard` WHERE `date` = :date", nativeQuery = true)
    List<DashboardDTO> viewDashboard(@Param("date") String date);
}


