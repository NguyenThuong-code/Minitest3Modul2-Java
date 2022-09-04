package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements  Serializable {
    private String fullName;
    private LocalDate dateOfBirth;
    private String idNumber;
    private Hotel hotel;
    private int dayRent;

    public Person() {
    }

    public Person(String fullName, LocalDate dateOfBirth, String idNumber, Hotel hotel, int dayRent) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.hotel = hotel;
        this.dayRent = dayRent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", idNumber='" + idNumber + '\'' +
                ", hotel=" + hotel +
                ", dayRent=" + dayRent +
                '}';
    }
//    @Override
//    public double payMoney() {
//        double calculator = getDayRent()*getHotel().getPriceRoom();
//        return calculator;
//    }
}
