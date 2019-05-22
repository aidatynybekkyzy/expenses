package com.example.demoTownsPratice.model;

public class Towns {
    private int id;
    private String value;

    public Towns(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public Towns() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
