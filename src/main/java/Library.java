import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;

    public Library() {
        this.collection = new ArrayList<Book>();
    }

    public int getCollection() {
        return this.collection.size();
    }
}
