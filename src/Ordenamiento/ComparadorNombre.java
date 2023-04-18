package Ordenamiento;

import java.util.Comparator;
public class ComparadorNombre implements Comparator <Persona1> {

    @Override
    public int compare(Persona1 persona1, Persona1 persona12) {
        return persona1.getNombre().compareTo(persona12.getNombre());
    }
}
