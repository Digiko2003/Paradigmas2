package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapasJugadores {
    public static void main(String[] args) {
        // Ejemplo de un mapa que almacena el par: nombre del jugador y equipo
        // El nombre del jugador y el nombre del equipo serán String
        Map<String, String> jugadores = new HashMap<>();

        // Inserción de elementos en el mapa
        jugadores.put("Leo Messi","Barcelona");
        jugadores.put("Luis Suarez","Barcelona");
        jugadores.put("Arturo Vidal","Barcelona");
        jugadores.put("Rakitik","Barcelona");
        jugadores.put("Sergio Ramos","Real Madrid");
        jugadores.put("Toni Kroos","Real Madrid");
        jugadores.put("Luka Modric","Real Madrid");
        jugadores.put("Ansu Fatii",null);

        // Otras formas d eocnstruir clases
        // Utilizando el constructor de la clase
        /// Map<String, String> players2 = new HashMap<>(jugadores);

        // Utilizando el metodo putAll(Map<? extends K, ? extends v> m)
        // Map<String, String> players3 = new HashMap<>();
        /// players.3putAll(jugadores);
        imprimirLinea();
        // Añadir si hay un valor ausente
        jugadores.putIfAbsent("Ansu Fati", "Barcelona");
        System.out.println("El equipo de Ansu Fati es: " + jugadores.get("Ansu Fati"));
        imprimirLinea();
        // Si ahora intetno cambiarlo de nuevo, ya no lo permite.
        jugadores.putIfAbsent("Ansu Fati", "Barcelona");
        System.out.println("¿En qué equipo está ahora Ansu Fati?:: " + jugadores.get("Ansu Fati"));
        imprimirLinea();
        // Obtener los valores de un mapa
        String equipoleo = jugadores.get("Leo Messi");
        System.out.println("El equipo de Leo es: " + equipoleo);
        imprimirLinea();
        String equipoCristiano = jugadores.getOrDefault("Cristiano Ronaldo", "No esta registrado");
        System.out.println("El equipo de Cristiano Ronaldo es: " + equipoCristiano);
        imprimirLinea();
        // Preguntar si una clave esta incluida en el mapa
        if (jugadores.containsKey("Luka Modric")) {
            System.out.println("El equipo de Luka Modric es: " + jugadores.get("Luka Modric"));
        } else {
            System.out.println("No se encuentra Luka Modric");
        }
        imprimirLinea();

        // También es posible preguntar si existe un valor en el mapa
        System.out.println("¿Se encuentra un jugador del Sevilla? " + jugadores.containsValue("Sevilla"));
        imprimirLinea();

        // Obtener todos los valores del mapa
        System.out.println("¿Qué equipos estan registrados en relación a los jugadores?");
        System.out.println(jugadores.values());
        imprimirLinea();

        // Reemplazar uno de los valores en el mapa.
        jugadores.replace("Rakitik","Sevilla");
        System.out.println("Ahora Rakitik juega en: " + jugadores.get("Rakitik"));
        imprimirLinea();

        // Eliminar una entrada del mapa.
        System.out.println("¿Se encuentra Rakitik en el registro? " + jugadores.containsKey("Rakitik"));
        jugadores.remove("Rakitik");
        System.out.println("¿Se encuentra Rakitik en el registro? " + jugadores.containsKey("Rakitik"));
        imprimirLinea();
        // También podemos conocer el tamaño del mapa (el número de entradas en el mapa).
        System.out.println("El tamaño del mapa es: " + jugadores.size());
        imprimirLinea();

        // Preguntar si el mapa esta vacio.
        if (jugadores.isEmpty()) {
            System.out.println("El registro de jugadores está vacío");
        } else {
            System.out.println("El registro de jugadores no está vacío");
        }
        imprimirLinea();

        for (String player : jugadores.keySet()) {
            System.out.println("Jugador: " + player);
        }
        imprimirLinea();
        for (String equipo : jugadores.values()) {
            System.out.println("Equipos: " + equipo);
        }
        imprimirLinea();
        // Imprimir el par de valores del mapa con un forEach
        System.out.println("Impresión de jugadores y equipos utilizando forEach");
        jugadores.forEach((player, team) -> System.out.println("Jugador: " + player + " Equipo: " + team));
        imprimirLinea();
        // Limpiar el mapa por completo.
        jugadores.clear();
        System.out.println("La cantidad de jugadores en el mapa después de limpiarlo es: " + jugadores.size());
    }

    public static void imprimirLinea() {
        System.out.println("-------------------------------------------" + "-----------------------------------------");
        System.out.println();
    }
}