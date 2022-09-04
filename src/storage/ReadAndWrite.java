package storage;


import model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite implements ReadWriteData{
    public List<Person> readFile(){
        List<Person> personList= new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("hotel.dat");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object obj = ois.readObject();
            personList=(List<Person>) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }
    public void writeFile(List<Person> personList){
        try {
            FileOutputStream fos= new FileOutputStream("hotel.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(personList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
