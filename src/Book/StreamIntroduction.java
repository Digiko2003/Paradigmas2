package Book;

import Book.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {
    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();
        books.add(new Book("The alchemist","Paulo Coelho", "Adventire", 4.4));
        books.add(new Book("The notebook","Nicholas Sparks","Romance", 4.1));
        books.add(new Book("Horror Cocktail","Robert Bloch","Horror", 2.6));
        books.add(new Book("House of Leaves","Mark Danielewski","Horror", 4.0));
        System.out.println();

        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).toString());

        }
        //How do you print the list of books
        System.out.println("--------------");
        books.forEach(System.out::println);

        //Mostrar los kibros de que sean de genero romance y rating
        //sea mayor a 3. El resultado se guarda en una lista

        List<Book> popularRomanticBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Romance"))
                .filter(book -> book.getRating()>3)
                .collect(Collectors.toList());

        //Lista de libros de romace y con rating mayor a 3
        System.out.println();
        popularRomanticBooks.forEach(book -> System.out.println(book));

        System.out.println("--------------");


        List<Book> PauloBooks = books.stream()
                .filter(book -> book.getAuhor().equals("Paulo Coelho"))
                .collect(Collectors.toList());

        System.out.println();
        PauloBooks.forEach(System.out::println);

    }

}
