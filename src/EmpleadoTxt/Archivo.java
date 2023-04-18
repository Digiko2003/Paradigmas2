package EmpleadoTxt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Archivo {
    private String nombreArchivo;
    public Archivo(String nombreA) {
        this.nombreArchivo = nombreA;
    }
    public void crearArchivo() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
                System.out.println("El archivo " + nombreArchivo + " se ha creado.");
                salidaArchivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void escribirEnArchivo(ArrayList<Empleado> ListEmpleados) {
        try {
            PrintWriter salidaArchivo = new PrintWriter(nombreArchivo);
            for (Empleado empleadoAux : ListEmpleados) {
                salidaArchivo.println(empleadoAux.formatoArchivo());
            }
            salidaArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // fin de escribirEnArchivo
    public ArrayList<Empleado> leerDeArchivo() {
        ArrayList<Empleado> ListEmpleados = new ArrayList<>();
        try {
// Abrir el archivo
            File archivoLectura = new File(nombreArchivo);
            Scanner leerArchivo = new Scanner(archivoLectura);
// Leer el archivo
            while (leerArchivo.hasNext()) {
                String linea = leerArchivo.nextLine();
                String[] valores = linea.split("\\|"); //Dividir por |
                String primernombre = valores[0];
                String apellidoPaterno = valores[1];
                double salario = Double.parseDouble(valores[3]);
                String departamento = valores[2];
                Empleado empleadoAux = new Empleado(primernombre, apellidoPaterno, salario, departamento);
                ListEmpleados.add(empleadoAux);
            }
// Cerrar el archivo
            leerArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListEmpleados;
    } // fin de leerDeArchivo
}