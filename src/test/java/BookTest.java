import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("IT", "Stephan King", "Horror");
    }

    @Test
    public void hasTitle(){
        assertEquals("IT", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Stephan King", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Horror", book1.getGenre());
    }

}
