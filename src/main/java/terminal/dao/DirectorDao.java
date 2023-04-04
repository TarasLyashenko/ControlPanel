package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata277.Director;

@Repository
public interface DirectorDao extends CrudRepository<Director, Long>
{
}
