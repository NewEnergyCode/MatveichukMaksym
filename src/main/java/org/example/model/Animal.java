package org.example.model;

import java.util.Date;

public class Animal {

    private String name;
    private String breed;
    private Date dataOfLastArrived;
    private int age;
    private boolean gender;

    public Animal(String name, String breed, Date dataOfLastArrived, int age, boolean gender) {
        this.name = name;
        this.breed = breed;
        this.dataOfLastArrived = dataOfLastArrived;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", dataOfLastArrived=" + dataOfLastArrived +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getDataOfLastArrived() {
        return dataOfLastArrived;
    }

    public void setDataOfLastArrived(Date dataOfLastArrived) {
        this.dataOfLastArrived = dataOfLastArrived;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
