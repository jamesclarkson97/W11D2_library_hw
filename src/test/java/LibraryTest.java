import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void hasNoBooks() {
        assertEquals(0, library.getCollection());
    }
}
