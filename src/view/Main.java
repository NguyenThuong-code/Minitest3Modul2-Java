package view;

import com.sun.source.tree.NewArrayTree;
import controller.ManageHotel;
import model.Hotel;
import model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Hotel> hotelList= ManageHotel.hotelList;
    public static void main(String[] args) {
       ManageHotel mh= new ManageHotel();
//       mh.addNewRender(new Person(2, "President", 234, "Barack Obama", LocalDate.of(2011,12,5), "3422"));
//        mh.addNewRender(new Person(4, "VIP", 200, "Lady Gaga", LocalDate.of(2012,5,4), "3332"));
//        mh.addNewRender(new Person(6, "Normal", 120, "Nicky Mina", LocalDate.of(2014,2,5), "3122"));
//        mh.addNewRender(new Person(1, "President", 234, "Trump", LocalDate.of(2012,1,6), "3233"));
//        mh.addNewRender(new Person(3, "VIP", 200, "Car di B", LocalDate.of(2011,10,6), "3411"));

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Application Manager Render");
            System.out.println("Enter 1: to add new render!");
            System.out.println("Enter 2: to display render!");
            System.out.println("Enter 3: To delete information render!");
            System.out.println("Enter 4: To cal price of Render!");
            System.out.println("Enter 5: To exit!");
            String line= sc.nextLine();
            switch (line){
                case "1":{
                    mh.addRenderToList(hotelList);
                    break;
                }
                case "2":{
                    for (Hotel list:hotelList
                         ) {
                        System.out.println(list.toString());
                    }
                    break;
                }
                case "3":{
                mh.deleteRender(hotelList);
                break;
                }
                case "4":{
                    System.out.println(mh.payMoney());
                    break;
                }
                case "5":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
