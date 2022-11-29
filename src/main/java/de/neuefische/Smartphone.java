package de.neuefische;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{
    private String modelName;
    private String brandName;
    private String[] allContacts;


    @Override
    public String startRadio() {
        return "Radio started";
    }

    @Override
    public String stopRadio() {
        return "Radio stopped";
    }

    @Override
    public String getPosition() {
        return "Rostock";
    }

    public Smartphone(String modelName, String brandName, String[] allContacts) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.allContacts = allContacts;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String[] getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(String[] allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", allContacts=" + Arrays.toString(allContacts) +
                '}';
    }
}
