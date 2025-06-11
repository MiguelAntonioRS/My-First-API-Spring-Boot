package com.example.apiRest.models;

public class Boot {
    private String name;
    private double value;
    private String id;

    public Boot() {
    }

    public Boot(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
