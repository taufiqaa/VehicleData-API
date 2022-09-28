package com.mytask.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_data")
public class VehicleData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String registration_number;

    private String owner;

    private String vehicle_brand;

    private String owner_address;

    private int production_year;

    private int cilinder_capacity;

    private String vehicle_color;

    private String fuel;

    public VehicleData() {
    }

    public VehicleData(String registration_number, String owner, String vehicle_brand, String owner_address,
            int production_year, int cilinder_capacity, String vehicle_color, String fuel) {
        this.registration_number = registration_number;
        this.owner = owner;
        this.vehicle_brand = vehicle_brand;
        this.owner_address = owner_address;
        this.production_year = production_year;
        this.cilinder_capacity = cilinder_capacity;
        this.vehicle_color = vehicle_color;
        this.fuel = fuel;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVehicle_brand() {
        return vehicle_brand;
    }

    public void setVehicle_brand(String vehicle_brand) {
        this.vehicle_brand = vehicle_brand;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public int getProduction_year() {
        return production_year;
    }

    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }

    public int getCilinder_capacity() {
        return cilinder_capacity;
    }

    public void setCilinder_capacity(int cilinder_capacity) {
        this.cilinder_capacity = cilinder_capacity;
    }

    public String getVehicle_color() {
        return vehicle_color;
    }

    public void setVehicle_color(String vehicle_color) {
        this.vehicle_color = vehicle_color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
