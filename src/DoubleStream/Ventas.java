package DoubleStream;

import java.util.stream.DoubleStream;
//Diego Arturo Enriquez Mercado
public class Ventas {
    public static void main(String[] args) {
        double[] ventas = {9.0,3000.0,9999.0,890.0,1999.0,3874.0,2343};

        System.out.println("Imprimir datos: ");
        DoubleStream.of(ventas)
                .forEach(System.out::println);

        System.out.println("DoubleStream.Ventas que superaron los 1000 pesos");
        System.out.println(DoubleStream.of(ventas)
                .map(d -> d + 0)
                .filter(d->d >1000)
                .count());

        System.out.println("Total de ventas");
        System.out.println(DoubleStream.of(ventas)
                .map(d -> d + 0)
                .sum());

        System.out.println("Venta máxima que esté en el rango de $1000 a $2000");
        System.out.println(DoubleStream.of(ventas)
                .map(d -> d + 0)
                .filter(d->d >1000)
                .filter(d->d <2000)
                .max()
                .getAsDouble());

        System.out.println("Venta minima que esté en el rango de $0 a $5000");
        System.out.println(DoubleStream.of(ventas)
                .map(d -> d + 0)
                .filter(d->d >0)
                .filter(d->d <5000)
                .min()
                .getAsDouble());

        System.out.println("Promedio de ventas");
        System.out.println(DoubleStream.of(ventas)
                .average()
                .getAsDouble());


    }
}
