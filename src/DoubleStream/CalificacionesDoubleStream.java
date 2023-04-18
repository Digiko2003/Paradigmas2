package DoubleStream;

import java.util.stream.DoubleStream;


public class CalificacionesDoubleStream {
    public static void main(String[] args) {
        double[] calificaciones = {3.2, 10.0, 6.7, 5.1, 4.6, 7.8, 8.2, 7.5, 5.8, 8.7};

        //Imprimir las calificaciones originales
        System.out.println("Calificaciones originales");
        DoubleStream.of(calificaciones)
                .forEach(System.out::println);

        System.out.println("Promedio de aquellos que pasaron");
        System.out.println(DoubleStream.of(calificaciones)
                .filter(d->d >6)
                .average()
                .getAsDouble());

        System.out.println("Numero de reprobados");
        System.out.println(DoubleStream.of(calificaciones)
                .map(d -> d + 0)
                .filter(d->d <6)
                .count());

        System.out.println("Calificación máxima de los que están entre 6.0 y 8.0");
        System.out.println(DoubleStream.of(calificaciones)
                .map(d -> d + 0)
                .filter(d->d >6)
                .filter(d->d <8)
                .max()
                .getAsDouble());

        System.out.println("Calificación mínima de los que están entre 4.0 y 6.0");
        System.out.println(DoubleStream.of(calificaciones)
                .filter(d->d >4)
                .filter(d->d <6)
                .min()
                .getAsDouble());

        System.out.println("Sumar un punto a todos y mostrarlos");
        DoubleStream.of(calificaciones)
                .map(d -> d + 1)
                .forEach(System.out::println);
    }
}