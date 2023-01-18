package ee.bcs.javaproject.controller;

import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private List<Car> cars;

// allolevat koodi ise ei kirjuta, kasuta alt + insert -> getters & setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}