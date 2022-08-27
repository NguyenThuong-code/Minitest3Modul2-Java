package model;

import java.io.Serializable;

public abstract class Hotel implements Serializable {
    private int numberDateRent;
    private String typeRoom;
    private double priceRoom;

    public Hotel() {
    }

    public Hotel(int numberDateRent, String typeRoom, double priceRoom) {
        this.numberDateRent = numberDateRent;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
    }

    public int getNumberDateRent() {
        return numberDateRent;
    }

    public void setNumberDateRent(int numberDateRent) {
        this.numberDateRent = numberDateRent;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }
 public abstract  String getIdNumber();
    @Override
    public String toString() {
        return
                "numberDateRent=" + numberDateRent +
                ", typeRoom='" + typeRoom + '\'' +
                ", priceRoom=" + priceRoom ;
    }
}
