import org.junit.jupiter.api.Test;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.InMemoryBookRepository;
import static org.mockito.Mockito.*;

public class TestInMemoryBookRepository {

    @Test
    public void testFindById() {
//        Подготовка
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
//        выполнение
        inMemoryBookRepository.findById("1");
//        Проверка утверждения
        verify(inMemoryBookRepository, times(1)).findById("1");
    }
    @Test
    public void testFindAll() {
        BookRepository bookRepository = mock(BookRepository.class);
//        Подготовка
        bookRepository.findAll();
//        Проверка утверждения
        verify(bookRepository).findAll();
    }
}
