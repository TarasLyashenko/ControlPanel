package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.lesson.Solder;

@Repository
public interface SolderDao extends CrudRepository<Solder, Long>
{
    Solder findByName(String name);
}
