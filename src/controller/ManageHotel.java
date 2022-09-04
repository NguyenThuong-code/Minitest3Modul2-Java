package controller;

import model.Hotel;
import model.TypeRoomNormal;
import model.TypeRoomPresident;
import model.TypeRoomVIP;

import java.util.ArrayList;
import java.util.List;

public class ManageHotel {

    private String director;
    public static List<Hotel> hotelList=new ArrayList<>();
    private static TypeRoomNormal typeNormal= new TypeRoomNormal();
    private static TypeRoomVIP typeVIP= new TypeRoomVIP();
    private static TypeRoomPresident typePresident = new TypeRoomPresident();

    static {
        hotelList.add(typeNormal);
        hotelList.add(typeVIP);
        hotelList.add(typePresident);
    }
    public void addNewHotel(Hotel hotel){
        hotelList.add(hotel);
    }
    public void editTypeRoom(int index, Hotel hotel){
        hotelList.set(index,hotel);
    }
    public ManageHotel(){}

    public ManageHotel(String name){
        this.director=name;
    }

    public ManageHotel(String name, List<Hotel> hotelList){
        this.director=name;
        this.hotelList= hotelList;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static List<Hotel> getHotelList() {
        return hotelList;
    }

    public static void setHotelList(List<Hotel> hotelList) {
        ManageHotel.hotelList = hotelList;
    }
}
