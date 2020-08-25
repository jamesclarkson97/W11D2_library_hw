import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("The Jungle Books", "Rudyard Kipling", "Children");
        library = new Library(2);
        library.addBook(book);
    }

    @Test
    public void hasPersonalCollection() {
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.getCollection());
    }

}
