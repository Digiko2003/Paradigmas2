package EmpleadoTxt;

import EmpleadoTxt.Archivo;
import EmpleadoTxt.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ProcesarEmpleados {
    public static void main(String[] args) {

        Archivo archivox = new Archivo("Empleados.txt");
        archivox.crearArchivo();
        List<Empleado> Empleados = archivox.leerDeArchivo();




        Empleado[] empleados = {
                new Empleado("Jose", "Garcia", 500, "Ti"),
                new Empleado("Rosario", "Vazquez", 7600, "Ti"),
                new Empleado("Luiz", "Prieto", 10000, "Ti"),
                new Empleado("luiz", "Vazquez", 4500, "Ventas"),
                new Empleado("Babriela", "Prieto", 6000, "Ventas"),
                new Empleado("Vianney", "Rodriguez", 65000, "Marketing"),
                new Empleado("Francisco", "Vazquez", 50000, "Marketing"),
                new Empleado("Irma", "Dominguez", 7500, "Ventas"),
                new Empleado("Rosario", "Prieto", 100000, "Marketing")
        };

        List<Empleado> listaEmpleados = Arrays.asList(empleados);
        //Muestra a todos los empleados
        System.out.println("Lista completa de empleados");
        imprimirRenglon();

        listaEmpleados.stream().forEach(System.out::println);
        imprimirEncabezado();


        System.out.println("Mostrar empleados cuyo apellido es Vazquez");
        List<Empleado> Vazquez = listaEmpleados.stream()
                .filter(Empleado -> Empleado.getApellidoPaterno().equalsIgnoreCase("Vazquez"))
                .collect(Collectors.toList());
        System.out.println();
        Vazquez.forEach(Empleado -> System.out.println(Empleado));


        System.out.println("-------------------------------");
        System.out.println("Total de salarios de todos los empleados");
        //double totalSalario = listaEmpleados.stream()
                //.mapToDouble(Empleados -> Empleados.getSalario())
                //.reduce(0, (A, B) -> A + B);
        //System.out.println(DoubleStream.of(totalSalario)
                //.sum());


        System.out.println("-------------------------------");
        System.out.println("Total de salarios de todos los empleados cuyo salario es mas de 10000");
        //double SalarioAlto = listaEmpleados.stream()
                //.mapToDouble(Empleado -> Empleados.getSalario())
                //.reduce(0, (A, B) -> A + B);

        //System.out.println(DoubleStream.of(SalarioAlto)
                //.filter(d -> d > 100000)
                //.sum());


        System.out.println("-------------------------------");
        System.out.println("Mostrar empleados cuyo departamento es Marketing");
        List<Empleado> Marketing = listaEmpleados.stream()
                .filter(Empleado -> Empleado.getDepartamento().equalsIgnoreCase("Marketing"))
                .collect(Collectors.toList());
        System.out.println();
        Marketing.forEach(Empleado -> System.out.println(Empleado));



        System.out.println("-------------------------------");
        System.out.println("");

        double SalarioAltoTI = Arrays.stream(empleados)
                .filter(Empleado -> Empleado.getDepartamento().equals("Ti"))
                .mapToDouble(Empleado::getSalario)
                .max()
                .orElse(Double.NaN);
        System.out.printf("Salario mas alto de los trabajadores en TI= %.2f", SalarioAltoTI);
        System.out.println("");

        System.out.println("-------------------------------");

        System.out.println("Empleados en ventas");
        long EmpleadosenVentas = Arrays.stream(empleados)
                .filter(Empleado -> Empleado.getDepartamento().equals("Ventas"))
                .count();

        System.out.printf("\n Hay %d empleados en el departamento de ventas. %n", EmpleadosenVentas);

    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%12s %12s %12s %12s%n", "Nombre", "Apellidos", "Salario", "Departamento");
        System.out.println("-------------------------------");
    }

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("----------------------------------------------------------");


    }
}
