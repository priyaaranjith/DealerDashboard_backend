package com.example.DealerDashboard.service;

import com.example.DealerDashboard.dto.HospitalDTO;
import com.example.DealerDashboard.entity.Hospitals;
import com.example.DealerDashboard.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public List<HospitalDTO> hosOrder() {
        List<Hospitals> hospitals = hospitalRepository.findAll();
        List<HospitalDTO> hospitalDTOs = new ArrayList<>();

        for (Hospitals hospital : hospitals) {
            HospitalDTO hospitalDTO = convertToDTO(hospital);
            hospitalDTOs.add(hospitalDTO);
        }

        return hospitalDTOs;
    }

    private HospitalDTO convertToDTO(Hospitals hospital) {
        HospitalDTO hospitalDTO = new HospitalDTO();
        hospitalDTO.setId(hospital.getId());
        hospitalDTO.setName(hospital.getName());
        hospitalDTO.setAddress(hospital.getAddress());
        hospitalDTO.setTotal_orders(hospital.getTotal_orders());

        return hospitalDTO;
    }
}
