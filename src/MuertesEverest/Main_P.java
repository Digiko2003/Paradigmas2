package MuertesEverest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_P {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("muertes_everest.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                Person person = new Person(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4], data[5], data[6]);
                people.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenar por causa de muerte, nacionalidad y ubicación
        Collections.sort(people, Comparator.comparing(Person::getCauseOfDeath)
                .thenComparing(Person::getNationality)
                .thenComparing(Person::getLocation));

        // Imprimir resultados
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private String date;
    private int age;
    private String expedition;
    private String nationality;
    private String causeOfDeath;
    private String location;

    public Person(String name, String date, int age, String expedition, String nationality, String causeOfDeath, String location) {
        this.name = name;
        this.date = date;
        this.age = age;
        this.expedition = expedition;
        this.nationality = nationality;
        this.causeOfDeath = causeOfDeath;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getAge() {
        return age;
    }

    public String getExpedition() {
        return expedition;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%d|%s|%s|%s|%s", name, date, age, expedition, nationality, causeOfDeath, location);
    }
}