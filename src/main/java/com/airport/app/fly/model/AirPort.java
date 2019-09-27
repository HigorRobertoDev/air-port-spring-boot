package com.airport.app.fly.model;

import javax.persistence.*;

@Entity
@Table(name = "airports")
public class AirPort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tel_imprensa")
    private String telImprensa;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "sdu", nullable = false)
    private String sdu;
    @Column(name = "uf", nullable = false)
    private String state;
    @Column(name = "tel_superintendente")
    private String telSuperintendente;
    @Column(name = "url")
    private String url;

    public AirPort() {
    }

    public AirPort(Long id, String telImprensa, String city, String name, String phone, String sdu, String state, String telSuperintendente, String url) {
        this.id = id;
        this.telImprensa = telImprensa;
        this.city = city;
        this.name = name;
        this.phone = phone;
        this.sdu = sdu;
        this.state = state;
        this.telSuperintendente = telSuperintendente;
        this.url = url;
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
}
