package Ordenamiento;

import java.util.Comparator;

public class CompradorEdadNombre implements  Comparator <Persona1>{
    @Override
    public int compare(Persona1 persona1, Persona1 persona12){
        //Primero vamos a comprar la edad
        if(persona1.getEdad() > persona12.getEdad()){
            return 1;
        }else if (persona1.getEdad() < persona12.getEdad()){
            return -1;
        }
        //Si las edades son iguales, entonces comparar el nombre
        return persona1.getNombre().compareTo(persona12.getNombre());
    }
}
