package model;

public class TypeRoomVIP extends Hotel{
    public TypeRoomVIP(){
        super("VIP", 150);
    }
    public String toString() {
        return "TypeRoomVIP{" +
                "typeRoom='"+ getTypeRoom()+" " +
                "Price Room"+ getPriceRoom()+"" +
                "}";
    }
}
