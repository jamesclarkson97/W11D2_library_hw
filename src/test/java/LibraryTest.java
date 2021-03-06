import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(100);
        book = new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void hasNoBooks() {
        assertEquals(0, library.getCollection());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getCollection());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.getCollection());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void hasSpace() {
        assertEquals(true, library.checkForSpace());
    }
}
