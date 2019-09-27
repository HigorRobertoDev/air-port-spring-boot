package com.airport.app.fly.dto.airport.output;

import com.airport.app.fly.model.AirPort;

import java.util.ArrayList;
import java.util.List;

public class AirPortRepresentation {

    private Long id;
    private String telImprensa;
    private String city;
    private String name;
    private String phone;
    private String sdu;
    private String state;
    private String telSuperintendente;
    private String url;

    public AirPortRepresentation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelImprensa() {
        return telImprensa;
    }

    public void setTelImprensa(String telImprensa) {
        this.telImprensa = telImprensa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSdu() {
        return sdu;
    }

    public void setSdu(String sdu) {
        this.sdu = sdu;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTelSuperintendente() {
        return telSuperintendente;
    }

    public void setTelSuperintendente(String telSuperintendente) {
        this.telSuperintendente = telSuperintendente;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static AirPortRepresentation from(AirPort airPort) {
        AirPortRepresentation representation = new AirPortRepresentation();
        representation.setId(airPort.getId());
        representation.setTelImprensa(airPort.getTelImprensa());
        representation.setCity(airPort.getCity());
        representation.setName(airPort.getName());
        representation.setPhone(airPort.getPhone());
        representation.setSdu(airPort.getSdu());
        representation.setState(airPort.getState());
        representation.setTelSuperintendente(airPort.getTelSuperintendente());
        representation.setUrl(airPort.getUrl());
        return representation;
    }

    public static List<AirPortRepresentation> from(List<AirPort> airPorts) {
        List<AirPortRepresentation> airPortRepresentations = new ArrayList<>();

        airPorts.stream()
                .forEach(airPort -> {
                    AirPortRepresentation representation = new AirPortRepresentation();
                    representation.setId(airPort.getId());
                    representation.setTelImprensa(airPort.getTelImprensa());
                    representation.setCity(airPort.getCity());
                    representation.setName(airPort.getName());
                    representation.setPhone(airPort.getPhone());
                    representation.setSdu(airPort.getSdu());
                    representation.setState(airPort.getState());
                    representation.setTelSuperintendente(airPort.getTelSuperintendente());
                    representation.setUrl(airPort.getUrl());
                    airPortRepresentations.add(representation);
                });
        return airPortRepresentations;
    }

}
