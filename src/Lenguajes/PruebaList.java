package Lenguajes;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PruebaList {
    public static void main(String[] args) {
        //Agrega varios colores a lista
        LinkedList<String> listal = new LinkedList<>();
        listal.add("Negro");
        listal.add("Amarillo");
        listal.add("Verde");
        listal.add("Azul");
        listal.add("Violeta");
        listal.add("Plateado");

        //Agrega varios colores a lista2
        LinkedList<String> listal2 = new LinkedList<>();
        listal.add("Dorado");
        listal.add("Blanco");
        listal.add("Cafe");
        listal.add("Azul");
        listal.add("Gris");
        listal.add("Plateado");

        //convierte las 2 listas
        listal.addAll(listal2);
        //Libera los recursos de lista2
        listal2 = null;
        imprimirLista(listal);

        //convierte el elemento listal a mayusculas
        convertirCadenasAMayusculas(listal); // imprime los elementos 4 a 6

        System.out.printf("%nEliminando elementos 4 a 6...");
        eliminarElementos(listal, 4, 7);// elimina los elementos
        imprimirLista(listal);//imprime los elementos
        imprimirListaInversa(listal);//imprime la lista
    }//fin de main

    private static void imprimirLista(LinkedList<String>lista) {
        System.out.printf("%nlista: %n");
        for(String color : lista){
            System.out.printf("%s ", color);
        }
        System.out.println();
        //Fin de imprimir lista

    }
    //localiza los objetos string y convierte a mayusculas
    private  static void  convertirCadenasAMayusculas(LinkedList<String>lista){
        ListIterator<String> iterator = lista.listIterator();
        while ((iterator.hasNext())){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }

    }
//obtener una sublista
    private static void eliminarElementos(List<String> lista, int inicio, int fin){
        lista.subList(inicio,fin).clear();
    }
    //imprime lista inversa
    private static void imprimirListaInversa(List<String>lista){
        ListIterator<String> iterator = lista.listIterator(lista.size());
        System.out.printf("%nLista inversa: %n");
        //
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }

    }

    }

























