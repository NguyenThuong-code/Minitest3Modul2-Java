package controller;

import model.CountRent;
import model.Hotel;
import model.Person;
import storage.ReadAndWrite;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageHotel {
    public static List<Hotel> hotelList;

    static {
        hotelList = ReadAndWrite.readFile();
    }

    //  public void addNewRender(Hotel hotel){
//      hotelList.add(hotel);
//      ReadAndWrite.writeFile(hotelList);
//  }
    public void addRenderToList(List<Hotel> hotelList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number date Rent:");
        int numberDateRent = sc.nextInt();
        System.out.println("Enter Type room:");
        sc.nextLine();
        String typeRoom = sc.nextLine();
        System.out.println("Enter Price of room:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Name Render:");
        String name = sc.nextLine();
        System.out.println("Enter date Of Birth");
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter Month:");
        int month = sc.nextInt();
        System.out.println("Enter day:");
        int day = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        sc.nextLine();
        System.out.println("Enter id card");
        String id = sc.nextLine();
        Person person = new Person(numberDateRent, typeRoom, price, name, date, id);
        hotelList.add(person);
        ReadAndWrite.writeFile(hotelList);
    }

    public void deleteRender(List<Hotel> hotelList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the idCard to remove!");
        String id = sc.nextLine();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i) instanceof Person) {
                if (hotelList.get(i).getIdNumber().equals(id))
                    hotelList.remove(hotelList.get(i));
                ReadAndWrite.writeFile(hotelList);
            } else {
                System.out.println("Not Found Id:");
            }
        }
    }

    public double payMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the idCard to calMoney!");
        String id = sc.nextLine();
        double price= 0;
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i) instanceof CountRent) {
                if (hotelList.get(i).getIdNumber().equals(id))
                    price= ((CountRent) hotelList.get(i)).payMoney();
            }

        }
        return price;
    }
}