package com.example.DealerDashboard.service;

import com.example.DealerDashboard.dto.ConsumablesDTO;
import com.example.DealerDashboard.entity.Consumables;
import com.example.DealerDashboard.repository.ConsumablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumablesServiceImpl implements ConsumablesService {

    @Autowired
    private ConsumablesRepository consumablesRepository;

    @Override
    public List<ConsumablesDTO> allTools() {
        List<Consumables> consumablesList = consumablesRepository.findAll();
        List<ConsumablesDTO> consumablesDTOList = new ArrayList<>();

        for (Consumables consumables : consumablesList) {
            ConsumablesDTO consumablesDTO = convertToDTO(consumables);
            consumablesDTOList.add(consumablesDTO);
        }

        return consumablesDTOList;
    }

    private ConsumablesDTO convertToDTO(Consumables consumables) {
        ConsumablesDTO consumablesDTO = new ConsumablesDTO();
        consumablesDTO.setId(consumables.getId());
        consumablesDTO.setConsumables(consumables.getConsumables());
        consumablesDTO.setAs_on_date(consumables.getAs_on_date());
        consumablesDTO.setCount(consumables.getCount());

        return consumablesDTO;
    }
}
