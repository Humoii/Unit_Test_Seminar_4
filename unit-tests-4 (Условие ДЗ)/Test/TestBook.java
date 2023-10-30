import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    Book book;
    @BeforeEach
    void  setUp() {
//        Подготовка
        book = new Book("1", "Ragnarok", "Bernard");
    }
    @Test
    public void testPBookGetId() {
//        Проверка утверждения
        assertEquals(book.getId(), "1");
    }
    @Test
    public void testPBookSetId() {
//        выполнение
        book.setId("2");
//        Проверка утверждения
        assertThat(book.getId()).isEqualTo("2");
    }
    @Test
    public void testPBookGetTitle() {
//        Проверка утверждения
        assertEquals(book.getTitle(),"Ragnarok");
    }
    @Test
    public void testPBookSetTitle() {
//        выполнение
        book.setTitle("Tu tu");
//        Проверка утверждения
        assertEquals(book.getTitle(),"Tu tu");
    }
    @Test
    public void testPBookGetAuthor() {
//        Проверка утверждения
        assertEquals(book.getAuthor(), "Bernard");
    }
    @Test
    public void testPBookSetAuthor() {
//        выполнение
        book.setAuthor("Joni");
//        Проверка утверждения
        assertEquals(book.getAuthor(), "Joni");

    }
}
