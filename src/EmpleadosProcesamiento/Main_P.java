package EmpleadosProcesamiento;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main_P {
    public static void main(String[] args) {
        Empleado_P[] empleados = {
                new Empleado_P("José", "García", 5000, "TI"),
                new Empleado_P("Rosario", "Vázquez", 7600, "TI"),
                new Empleado_P("Luis", "Prieto", 10000, "TI"),
                new Empleado_P("Luis", "Vázquez", 4500, "Ventas"),
                new Empleado_P("Gabriela", "Prieto", 6000, "Ventas"),
                new Empleado_P("Vianney", "Rodríguez", 65000, "Marketing"),
                new Empleado_P("Francisco", "Vázquez", 50000, "Marketing"),
                new Empleado_P("Irma", "Domínguez", 7500, "Ventas"),
                new Empleado_P("Rosario", "Prieto", 100000, "Marketing")
        };
        List<Empleado_P> listaEmpleados = Arrays.asList(empleados);
        // Muestra a todos los empleados
        System.out.println("Lista completa de empleados");

        imprimirEncabezado();
        listaEmpleados.parallelStream().

                forEach(System.out::println);

        imprimirRenglon();

// Agrupación de objetos Empleado por departamento
        System.out.println("Empleados por departamento");
        Map<String, List<Empleado_P>> agrupadoPorDepartamento = listaEmpleados.stream().collect(Collectors.groupingBy(Empleado_P::getDepartamento));
        agrupadoPorDepartamento.forEach((departamento, empleadosEnDepartamento) ->

                {
                    System.out.println(departamento);
                    empleadosEnDepartamento.forEach(empleado -> System.out.printf("  %s%n", empleado.toString()));
                }
        );

        imprimirRenglon();

    }

    public static void imprimirRenglon() {
        System.out.println();
        System.out.println("----------------------------------------------------------");
    }

    public static void imprimirEncabezado() {
        System.out.printf("%12s %12s %12s %12s%n", "Nombre", "Apellidos", "Salario", "Departamento");
        System.out.println("----------------------------------------------------");
    }
}