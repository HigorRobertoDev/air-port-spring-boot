package com.airport.app.fly.roles;

import com.airport.app.fly.dto.airport.input.AirPortDTO;
import com.airport.app.fly.model.AirPort;

import java.util.List;

public interface AirPortRoles {

    AirPort save(AirPortDTO airPortDTO);
    List<AirPort> saveInBatch(List<AirPortDTO> airPortDTOS);
    List<AirPort> findAll();
    AirPort findById(Long id);
    void deleteAirPortById(Long id);
}
