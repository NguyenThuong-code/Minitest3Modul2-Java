package model;

import java.io.Serializable;

public class Hotel implements Serializable {

    private String typeRoom;
    private double priceRoom;

    public Hotel() {
    }

    public Hotel(String typeRoom, double priceRoom) {
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
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
}
