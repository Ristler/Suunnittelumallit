package prototype;

public class Book implements Prototype {
    private String author;
    private String title;
    private String genre;
    private int publicationYear;


    public Book(String author, String title, String genre, int publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }
    @Override
    public Book clone() {
        return new Book(this.author, this.title, this.genre, this.publicationYear);
    }

    @Override
    public String toString() {
        return "Book" +
                "author= " + author + "\n" +
                "title= " + title + "\n" +
                "genre= " + genre + "\n" +
                "publication year= " + publicationYear + "\n";
    }
}
