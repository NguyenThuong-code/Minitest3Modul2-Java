package view;

import com.sun.source.tree.NewArrayTree;
import controller.ManageHotel;
import controller.ManageRender;
import model.Hotel;
import model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static List<Hotel> hotelList= ManageHotel.hotelList;
        public static List<Person> personList =ManageRender.renderList;

    public static ManageRender mr= new ManageRender();
    public static void main(String[] args) {

//     Person person= createNewRender();
//      mr.addNewRender(person);
//mh.addNewRender(new Person("Barack Obama",LocalDate.of(2011,12,5),"3422",s.getTypeRoom("N"),4));
//       mh.addNewRender(new Person(2, "President", 234, "Barack Obama", LocalDate.of(2011,12,5), "3422"));
//        mh.addNewRender(new Person(4, "VIP", 200, "Lady Gaga", LocalDate.of(2012,5,4), "3332"));
//        mh.addNewRender(new Person(6, "Normal", 120, "Nicky Mina", LocalDate.of(2014,2,5), "3122"));
//        mh.addNewRender(new Person(1, "President", 234, "Trump", LocalDate.of(2012,1,6), "3233"));
//        mh.addNewRender(new Person(3, "VIP", 200, "Car di B", LocalDate.of(2011,10,6), "3411"));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Application Manager Render");
            System.out.println("Enter 1: to add new render!");
            System.out.println("Enter 2: to display render!");
            System.out.println("Enter 3: To delete information render!");
            System.out.println("Enter 4: To cal price of Render!");
            System.out.println("Enter 5: To exit!");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter Number date Rent:");
                    int numberDateRent = sc.nextInt();
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
                    System.out.println("Enter type room");
                    String typeRoom =sc.nextLine();
                    Person person= null;
                    Hotel hotel=null;
                    boolean check = false;
                    for (int i=0; i< hotelList.size();i++) {
                        if (hotelList.get(i).getTypeRoom().equalsIgnoreCase(typeRoom)) {
                            check = true;
                            hotel = hotelList.get(i);
                        }
                    }
                    if (check) {
                        person = new Person(name,date,id,hotel,numberDateRent);
                        personList.add(person);
                        mr.addRenderToList(personList);
                    }
                    break;
                }
                case "2": {
                    mr.displayRender();
                    break;
                }
                case "3":{
                    System.out.println("Enter the idCard to remove!");
                    String id = sc.nextLine();
                mr.deleteRender(personList,id);
                break;
                }
                case "4":{
                    System.out.println("Enter the idCard to calMoney!");
                    String id = sc.nextLine();
                    System.out.println(mr.payMoney(personList,id));
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

