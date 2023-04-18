package EmpleadoTxt;

import EmpleadoTxt.Archivo;

public class Main {public static void main(String[] args) {// Recuperar los datos de un archivo de texto
    Archivo archivox = new Archivo("Empleados TI.txt");
    archivox.crearArchivo();
    }public static void imprimirLinea() {System.out.println();
    System.out.println("----------------------------------------------------------");}}