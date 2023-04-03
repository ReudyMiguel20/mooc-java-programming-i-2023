import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private ArrayList<Book> books;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

}
