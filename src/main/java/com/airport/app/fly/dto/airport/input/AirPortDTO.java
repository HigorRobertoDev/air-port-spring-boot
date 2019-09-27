package com.airport.app.fly.dto.airport.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.objects.annotations.Getter;

public class AirPortDTO {

    private String telImprensa;
    @JsonProperty("City")
    private String City;
    @JsonProperty("Id")
    private int Id;
    @JsonProperty("Index")
    private int Index;
    @JsonProperty("Name")
    private String Name;
    private String phone;
    @JsonProperty("SDU")
    private String SDU;
    @JsonProperty("State")
    private String State;
    private String telSuperintendente;
    @JsonProperty("Url")
    private String Url;

    public AirPortDTO() {
    }

    public String getTelImprensa() {
        return telImprensa;
    }

    public void setTelImprensa(String telImprensa) {
        this.telImprensa = telImprensa;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSDU() {
        return SDU;
    }

    public void setSDU(String SDU) {
        this.SDU = SDU;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getTelSuperintendente() {
        return telSuperintendente;
    }

    public void setTelSuperintendente(String telSuperintendente) {
        this.telSuperintendente = telSuperintendente;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
