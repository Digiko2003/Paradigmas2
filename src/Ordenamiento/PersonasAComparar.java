package Ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PersonasAComparar {
    public static void main(String[]args){
        List<Persona1> listaPersona1s = new ArrayList<>();
        listaPersona1s.add(new Persona1("Estephany", "Salas", 20));
        listaPersona1s.add(new Persona1("Luis", "Guadarrama", 21));
        listaPersona1s.add(new Persona1("Jorge", "Trejo", 17));
        listaPersona1s.add(new Persona1("Kimberly", "Franco", 19));
        listaPersona1s.add(new Persona1("Samuel", "Miranda", 22));
        //imprime los elementos del objeto list

        System.out.println("Elementos desordenados: ");
        listaPersona1s.forEach(persona -> System.out.println(persona));
        System.out.println();

        //Ordenamos por edad
        Collections.sort(listaPersona1s, new ComparadorEdad());
        System.out.println("Elementos de la lista ordenados por edad.");
        listaPersona1s.forEach(persona -> System.out.println(persona));
        System.out.println();
    }
}
