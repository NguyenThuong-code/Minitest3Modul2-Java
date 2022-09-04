package model;

public class CountMoney implements CountRent{
public static Person count = new Person();
    @Override
    public double payMoney() {
        double calculator = count.getDayRent()*count.getHotel().getPriceRoom();
        return calculator;
    }
}
