package model;

public class TypeRoomPresident extends Hotel{
    public TypeRoomPresident(){
        super("President",200);
    }
    public String toString() {
        return "TypeRooPresident{" +
                "typeRoom='"+ getTypeRoom()+" " +
                "Price Room"+ getPriceRoom()+"" +
                "}";
    }
}
