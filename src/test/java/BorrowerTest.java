import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book("IT", "Stephan King", "Horror");
        library.addBook(book);
    }

    @Test
    public void hasCollection(){
        assertEquals(0,borrower.getCollectionCount());
    }

    @Test
    public void canTakeBook(){
        borrower.takeBook(library);
        assertEquals(1, borrower.getCollectionCount());
    }
}
