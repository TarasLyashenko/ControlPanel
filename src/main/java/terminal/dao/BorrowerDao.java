package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.library.Borrower;

@Repository
public interface BorrowerDao extends CrudRepository<Borrower, Long> {

}
