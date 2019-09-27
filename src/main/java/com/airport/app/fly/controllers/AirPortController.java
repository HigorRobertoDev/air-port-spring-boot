package com.airport.app.fly.controllers;

import com.airport.app.fly.dto.airport.input.AirPortDTO;
import com.airport.app.fly.dto.airport.output.AirPortRepresentation;
import com.airport.app.fly.service.AirPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("air-port")
public class AirPortController {

    @Autowired
    AirPortService airPortService;

    @GetMapping
    public ResponseEntity<List<AirPortRepresentation>> getAllAirports() {
        return new ResponseEntity<>(
                AirPortRepresentation.from(airPortService.findAll()),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirPortRepresentation> getAirPortById(@PathVariable Long id) {
        return new ResponseEntity<>(
                AirPortRepresentation.from(airPortService.findById(id)),
                HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<AirPortRepresentation> saveAirPort(@Valid @RequestBody AirPortDTO input) {
        return new ResponseEntity<>(
                AirPortRepresentation.from(airPortService.save(input)),
                HttpStatus.OK
        );
    }

    @PostMapping("/save-in-batch")
    public ResponseEntity<List<AirPortRepresentation>> saveAirPortInBatch(@RequestBody List<AirPortDTO> input) {
        return new ResponseEntity<>(
            AirPortRepresentation.from(airPortService.saveInBatch(input)),
            HttpStatus.OK
        );
    }

}
