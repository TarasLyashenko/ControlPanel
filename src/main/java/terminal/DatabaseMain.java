package terminal;

import java.time.LocalDate;
import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.BookDao;
import terminal.dao.BorrowerDao;
import terminal.model.library.Book;
import terminal.model.library.Borrower;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private BookDao bookDao;
    @Resource
    private BorrowerDao borrowerDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args)
    {
        // Создание объектов
        Book book1 = new Book();
        book1.setTitle("Война и мир");
        book1.setPublicationDate(LocalDate.of(1869, 1, 1));
        bookDao.save(book1);

        Book book2 = new Book();
        book2.setTitle("Преступление и наказание");
        book2.setPublicationDate(LocalDate.of(1866, 1, 1));
        bookDao.save(book2);

        Book book3 = new Book();
        book3.setTitle("Горе от ума");
        book3.setPublicationDate(LocalDate.of(1825, 1, 1));
        bookDao.save(book3);

        Borrower borrower1 = new Borrower();
        borrower1.setName("Иванов Иван Иванович");
        borrower1.setPhone("+7 911 111-11-11");
        borrowerDao.save(borrower1);

        Borrower borrower2 = new Borrower();
        borrower2.setName("Петров Петр Петрович");
        borrower2.setPhone("+7 911 222-22-22");
        borrowerDao.save(borrower2);

        Borrower borrower3 = new Borrower();
        borrower3.setName("Сидоров Сидр Сидорович");
        borrower3.setPhone("+7 911 333-33-33");
        borrowerDao.save(borrower3);

        // Связывание объектов
        borrower1.getBooks().add(book1);
        borrower1.getBooks().add(book2);

        borrower2.getBooks().add(book1);
        borrower2.getBooks().add(book3);

        borrower3.getBooks().add(book2);
        borrower3.getBooks().add(book3);

        borrowerDao.save(borrower1);
        borrowerDao.save(borrower2);
        borrowerDao.save(borrower3);

        // Достаём книги из базы после связывания
        book1 = bookDao.findByTitle("Война и мир");
        book2 = bookDao.findByTitle("Преступление и наказание");
        book3 = bookDao.findByTitle("Горе от ума");

        // Проверка связей
        System.out.println();
    }
}
