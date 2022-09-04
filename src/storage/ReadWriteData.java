package storage;

import model.Hotel;
import model.Person;

import java.util.List;

public interface ReadWriteData {
    List<Person> readFile();
     void writeFile(List<Person> people);
}
