package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.test.Theater;

@Repository
public interface TheaterDao extends CrudRepository<Theater, Long>
{

}
