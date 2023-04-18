package Book;

public class Book {
    private String name;
    private String auhor;
    private String genre;
    private double rating;

    public Book(String name, String auhor, String genre, double rating) {
        this.name = name;
        this.auhor = auhor;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAuhor() {
        return auhor;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
    @Override
    public  String toString(){
        return "Book.Book["+
                "name='" + name + '\'' + ", author ='" + auhor + '\'' +
                ", genre ='" + genre + '\'' + ", rating=" + rating +
                ']';
    }
}
