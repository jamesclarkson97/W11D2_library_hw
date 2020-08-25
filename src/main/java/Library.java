import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (checkForSpace()) { this.collection.add(book);
        }
    }

    public boolean checkForSpace() {
        return this.capacity > this.collection.size();
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }
}
