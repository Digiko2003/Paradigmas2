//By Diego Arturo Enriquez mercado
package Empleado;

import java.util.*;

public class main {

    public static void main(String[] args) {


        List<Empleado> listaEmpleado = new ArrayList<>();
        listaEmpleado.add(new Empleado("García Carlos", 47899,"Contabilidad","Viepresidente",3000 ));
        listaEmpleado.add(new Empleado("Lopes Juan", 39119, "Ti","Programador",1500));
        listaEmpleado.add(new Empleado("Morales Colina", 81774, "Fabricacion","Ingeiero",4500));
        listaEmpleado.add(new Empleado("Diego Enriquez", 54236, "Contabilidad","Presidente",6000));
        listaEmpleado.add(new Empleado("Isaias Gracia", 38563, "Programador","Ingeiero",2500));
        listaEmpleado.add(new Empleado("Jose Guadarrama", 19247, "Fabricacion","Ingeiero",1500));
        listaEmpleado.add(new Empleado("Jesus Maldonado", 64829, "Programador","Ingeiero",2500));
        listaEmpleado.add(new Empleado("Monserrath Enriquez", 83649, "Contabilidad","Ingeiero",1000));
        listaEmpleado.add(new Empleado("Faridy Mercado", 16928, "Fabricacion","Ingeiero",20000));
        listaEmpleado.add(new Empleado("Citlalli Gonzalez", 23742, "Programador","Ingeiero",3000));
        listaEmpleado.add(new Empleado("Arturo Navarrte", 83493, "Contabilidad","Ingeiero",1000));
        listaEmpleado.add(new Empleado("Eduardo Contreraz", 45728, "Programador","Ingeiero",1200));


        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("-----------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("-----------------------------");
            System.out.println("1. Elementos desardenados");
            System.out.println("2. Ordenar por salario");
            System.out.println("3. Ordenar por departamento");
            System.out.println("4. Ordenar por departamento y puesto");
            System.out.println("5. Ordenar por departamento y salario");
            System.out.println("6. Salir");


            try {

                System.out.println("-----------------------------");
                System.out.println("Opcion: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Los elementos desordenados son:");
                        listaEmpleado.forEach(Empleado->System.out.println(Empleado));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Los elementos preordenados por salario son:");
                        Collections.sort(listaEmpleado,new OrdenarPorSalario());
                        listaEmpleado.forEach(Empleado->System.out.println(Empleado));
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Los elementos preordenados por departamento son:");
                        Collections.sort(listaEmpleado,new OrdenarPorDepartamento());
                        listaEmpleado.forEach(Empleado->System.out.println(Empleado));
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Los elementos preordenados por departamento y puesto son:");
                        Collections.sort(listaEmpleado,new OrdenarPorDepartamentoYPuesto());
                        listaEmpleado.forEach(Empleado->System.out.println(Empleado));
                        System.out.println();

                        break;
                    case 5:
                        System.out.println("Los elementos preordenados por departamento y salario son:");
                        Collections.sort(listaEmpleado,new OrdenarPorDepartamentoYSalario());
                        listaEmpleado.forEach(Empleado->System.out.println(Empleado));
                        System.out.println();
                        break;

                    case 6:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}