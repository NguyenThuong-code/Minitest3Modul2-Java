package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person extends Hotel implements CountRent, Serializable {
    private String fullName;
    private LocalDate dateOfBirth;
    private String idNumber;

    public Person(String fullName, LocalDate dateOfBirth, String idNumber) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
    }

    public Person(int numberDateRent, String typeRoom, double priceRoom, String fullName, LocalDate dateOfBirth, String idNumber) {
        super(numberDateRent, typeRoom, priceRoom);
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
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

    @Override
    public String toString() {
        return "Person{" +
                super.toString()+'\''+ " "+
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }

    @Override
    public double payMoney() {
        double calculator =getNumberDateRent()*getPriceRoom();
        return calculator;
    }
}
