package Ordenamiento;

import java.util.Comparator;
public class ComparadorEdad implements Comparator<Persona1> {

    public int compare(Persona1 persona1, Persona1 persona12){
        if(persona1.getEdad()== persona12.getEdad()){
            return 0;
        } else if (persona1.getEdad()> persona12.getEdad()) {
            return -1;
        }
        return 0;
    }


}