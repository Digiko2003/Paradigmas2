package Lenguajes;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class LenguajesDeProgramacion {

    static LinkedList<String> listaLenguajes = new LinkedList<>();

    public static void main(String[] args) {

        listaLenguajes.add("Python");


        Scanner scanner = new Scanner(System.in);
        int choice;
        String nombre;

        System.out.println("Lista de lenguajes de Programacion");

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Añador elemento al final");
            System.out.println("3. Añadir elemento al inicio");
            System.out.println("4. Mostrar los datos");
            System.out.println("5. Salir");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1");
                    System.out.println("Ingrese un Lenguaje de programacion");
                    nombre = scanner.next();
                    listaLenguajes.add(nombre);
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2");
                    System.out.println("Ingrese un lenguaje de programacion");
                    nombre = scanner.next();
                    listaLenguajes.addLast(nombre);
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opcion 3");
                    System.out.println("Ingrese un lenguaje de programacion");
                    nombre = scanner.next();
                    listaLenguajes.addFirst(nombre);
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opcion 4");
                    System.out.println("Los datos de la lista son");
                    for (String lenguaje : listaLenguajes) {
                        System.out.println(lenguaje);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Seleccione nuevamente.");
                    break;
            }
        } while (choice != 5);
    }

}