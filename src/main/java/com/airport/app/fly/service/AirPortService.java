package com.airport.app.fly.service;

import com.airport.app.fly.dto.airport.input.AirPortDTO;
import com.airport.app.fly.model.AirPort;
import com.airport.app.fly.repository.AirPortRepository;
import com.airport.app.fly.roles.AirPortRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AirPortService implements AirPortRoles {

    private final AirPortRepository airPortRepository;

    @Autowired
    public AirPortService(AirPortRepository airPortRepository) {
        this.airPortRepository = airPortRepository;
    }

    @Override
    public AirPort save(AirPortDTO airPortDTO) {
        AirPort airPort = new AirPort();
        airPort.setTelImprensa(airPortDTO.getTelImprensa());
        airPort.setCity(airPortDTO.getCity());
        airPort.setName(airPortDTO.getName());
        airPort.setPhone(airPortDTO.getPhone());
        airPort.setSdu(airPortDTO.getSDU());
        airPort.setState(airPortDTO.getState());
        airPort.setTelSuperintendente(airPortDTO.getTelSuperintendente());
        airPort.setUrl(airPortDTO.getUrl());

        return airPortRepository.save(airPort);
    }

    @Override
    public List<AirPort> saveInBatch(List<AirPortDTO> airPortDTOS) {
        List<AirPort> airPortList = new ArrayList<>();
        airPortDTOS.stream()
                .forEach(airPortDTO -> {
                    AirPort airPort = new AirPort();
                    airPort.setTelImprensa(airPortDTO.getTelImprensa());
                    airPort.setCity(airPortDTO.getCity());
                    airPort.setName(airPortDTO.getName());
                    airPort.setPhone(airPortDTO.getPhone());
                    airPort.setSdu(airPortDTO.getSDU());
                    airPort.setState(airPortDTO.getState());
                    airPort.setTelSuperintendente(airPortDTO.getTelSuperintendente());
                    airPort.setUrl(airPortDTO.getUrl());
                    airPortList.add(airPort);
                });
        return airPortRepository.saveAll(airPortList);
    }

    @Override
    public List<AirPort> findAll() {
        return airPortRepository.findAll();
    }

    @Override
    public AirPort findById(Long id) {
        return airPortRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There isn't airport with id: " + id));
    }

    @Override
    public void deleteAirPortById(Long id) {
        AirPort airPort = airPortRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There isn't Airport with id: " + id));
        airPortRepository.delete(airPort);
    }

}
