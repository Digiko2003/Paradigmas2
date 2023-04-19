package Mapas;

import java.util.*;

public class PruebaMapas {
    public static void main(String[] args) {
        HashMap<String, Integer> calificaciones = new HashMap<>();
        calificaciones.put("Carlos: ", 100);
        calificaciones.put("Roberto: ", 90);
        calificaciones.put("Carolina: ", 80);
        imprimirMapa(calificaciones);

        // Actualizar calificación de Carlos
        calificaciones.put("Carlos: ",60);
        imprimirMapa(calificaciones);

        // Borrar calificación de Carlos
        calificaciones.remove("Carlos");
        imprimirMapa(calificaciones);

        // ¿Cuál fue la calificación de Carolina?
        System.out.println("Calificación de Carolina: " + calificaciones.get("Carolina"));

        // ¿Existe una persona en el mapa?
        if (calificaciones.containsKey("Carolina")) {
            System.out.println("Carolina existe");
        } else {
            System.out.println("Carolina no existe");
        }
        boolean encontrado1 = encontrar(calificaciones, "Carolina");
        System.out.println(encontrado1);
        boolean encontrado2 = encontrar(calificaciones, "Maria");
        System.out.println(encontrado2);
        calificaciones.remove("Maria");
    }

    private static boolean encontrar(HashMap<String, Integer> calificaciones, String nombre) {
        return calificaciones.containsKey(nombre);
    }

    public static void imprimirMapa(HashMap<String, Integer> tabla) {
        // Mostrar los datos
        tabla.forEach(
                (nombre, calificacion) -> {
                    System.out.println(nombre + " " + calificacion);
                }
        );
        System.out.println("-------------------------------------");
    }
}