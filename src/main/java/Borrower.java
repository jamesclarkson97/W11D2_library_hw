import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<Book>();
    }

    public int getCollection() {
        return this.collection.size();
    }
}
