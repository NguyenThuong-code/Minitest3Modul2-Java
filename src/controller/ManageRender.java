package controller;


//import model.CountMoney;
import model.CountMoney;
import model.CountRent;
import model.Hotel;
import model.Person;
import storage.ReadAndWrite;
import storage.ReadWriteData;


import java.util.List;

public class ManageRender {
//    private String name;
//public static Person count = new Person();
    public static List<Person> renderList;
    public static ReadWriteData readWriteData=new ReadAndWrite();
   CountMoney money= new CountMoney();
      static {
         renderList = readWriteData.readFile();
      }
//      public ManageRender(String name){
//          this.name=name;
//      }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//      public void addNewRender(Person person){
//      renderList.add(person);
//      readWriteData.writeFile(renderList);
//  }
    public void displayRender(){
        for (Person list:renderList
        ) {
            System.out.println(list.toString());
        }
    }
    public void addRenderToList(List<Person> renderList) {
        readWriteData.writeFile(renderList);
    }

    public void deleteRender(List<Person> renderList,String id) {
        for (int i = 0; i < renderList.size(); i++) {
                if (renderList.get(i).getIdNumber().equals( id)){
                    renderList.remove(renderList.get(i));
//                readWriteData.writeFile(renderList);
            }else {
                    System.out.println("Id not found");
                }
        }
    }

    public double payMoney(List<Person> renderList,String id) {
        double price= 0;
        for (int i = 0; i < renderList.size(); i++) {
                if (renderList.get(i).getIdNumber().equals(id))
                    price = money.payMoney();
            }

        return price;
    }
}