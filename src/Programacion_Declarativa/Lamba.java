package Programacion_Declarativa;

import java.util.function.BiConsumer;

public class Lamba {
    public static void main(String[] args) {
        BiConsumer<String, String> biemvenida=(nombre, apellido) -> System.out.println("Biembenido " + nombre + apellido);
        biemvenida.accept("Diego ", "Enriquez");
    }
}
