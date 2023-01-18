package ee.bcs.javaproject.controller;

public class Car {

    private String regNr;

    private String brand;

    // all ei kirjuta siit ise

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }
}
