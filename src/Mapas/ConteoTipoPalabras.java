package Mapas;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

// Programa que cuenta el numero de ocurrencias de cada palabra de un objeto String
public class ConteoTipoPalabras {
    public static void main(String[] args) {
        // Crea el HashMap para almacenar valores String y valores Integer
        Map<String, Integer> miMapa = new HashMap<>();
        crearMapa(miMapa); // Crea el mapa de frecuencias con base a la entrada del usuario
        mostrarMapa(miMapa); // Muestra el contenido del mapa de frecuencias
    }

    // Crea el mapa de frecuencias a partir de la entrada del usuario
    private static void crearMapa(Map<String, Integer> frecuencias) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el enunciado: ");
        String enunciado = entrada.nextLine();

        // Divide el enunciado en tokens
        String[] tokens = enunciado.split(" ");

        // Procesamiento del texto de entrada
        for (String token : tokens) {
            String palabra = token.toLowerCase();
            // Si el mapa de frecuecnias contiene la entrada
            if (frecuencias.containsKey(palabra)) { // ¿Esta la palabra en frecuencias?
                int cuenta = frecuencias.get(palabra); // Obtiene la cuenta actual
                frecuencias.put(palabra,cuenta + 1); // Incrementa la cuenta
            } else {
                // Agrega una nueva palabra al mapa con una cuenta de uno
                frecuencias.put(palabra,1);
            }
        }
    }

    // Muestra el contenido del mapa de frecuencias
    private static void mostrarMapa(Map<String, Integer> frecuencias) {
        Set<String> claves = frecuencias.keySet(); // Obtiene las claves
        // Ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        System.out.printf("%nEl mapa contiene: %nClave\t\tValor%n");
        // Genera la salida para cada clave del mapa
        for (String clave : clavesOrdenadas) {
            System.out.printf("%-8s%8s%n", clave,frecuencias.get(clave));
        }
        // Escribe el tamaño del mpa si está vacío
        System.out.printf("%nTamaño: %d%n¿Está vacío el mapa?: %b%n",frecuencias.size(),frecuencias.isEmpty());
    }
}