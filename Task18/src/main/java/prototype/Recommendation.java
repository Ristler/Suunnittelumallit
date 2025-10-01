package prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype {

    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void changeTargetAudience(String newTargetAudience) {
        this.targetAudience = newTargetAudience;
    }

    @Override
    public Recommendation clone() {
        Recommendation copy = new Recommendation(this.targetAudience);

        for(Book book : books) {
            copy.addBook(book.clone());
        }
        return copy;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Recommendation for "+ targetAudience + ":\n");
        for(Book book : books) {
            builder.append(book).append("\n");
        }
        return builder.toString();
    }
}
