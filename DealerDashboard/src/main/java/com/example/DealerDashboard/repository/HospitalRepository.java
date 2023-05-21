package com.example.DealerDashboard.repository;

import com.example.DealerDashboard.entity.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface HospitalRepository extends JpaRepository<Hospitals,Integer> {

    @Query(value = "SELECT * FROM `hospitals` WHERE `total_orders` = :total_orders", nativeQuery = true)
    List<Map<String, String>> allOrder();
}
