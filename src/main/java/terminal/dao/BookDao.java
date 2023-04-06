package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.library.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Long> {

    Book findByTitle(String title);
}
