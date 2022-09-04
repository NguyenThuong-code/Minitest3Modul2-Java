package model;

public class  TypeRoomNormal extends Hotel{
    public TypeRoomNormal(){
        super("Normal", 100);
    }

    @Override
    public String toString() {
        return "TypeRoomNormal{" +
                "typeRoom='"+ getTypeRoom()+" " +
                "Price Room"+ getPriceRoom()+"" +
                "}";
    }
}
