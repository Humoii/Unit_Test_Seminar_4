import org.junit.jupiter.api.Test;
import seminars.fourth.book.BookService;
import static org.mockito.Mockito.*;

public class TestBookService {
    @Test
    public void testFindBookById() {
//        Подготовка
        BookService BookMock = mock(BookService.class);
//        выполнение
        BookMock.findBookById("1");
        BookMock.findBookById("1");
//        Проверка утверждения
        verify(BookMock, times(2)).findBookById("1");
    }
    @Test
    public void testFindAllBooks() {
//        Подготовка
        BookService bookService = mock(BookService.class);
        bookService.findAllBooks();
//        Проверка утверждения
        verify(bookService).findAllBooks();
    }

}
