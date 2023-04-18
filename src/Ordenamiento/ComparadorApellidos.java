package Ordenamiento;

import java.util.Comparator;
public class ComparadorApellidos implements Comparator <Persona1>{
    @Override
    public int compare(Persona1 persona1, Persona1 persona12) {
        return persona1.getApellido().compareTo(persona12.getApellido());
    }
}
