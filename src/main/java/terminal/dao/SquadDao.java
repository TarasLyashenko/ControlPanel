package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.lesson.Squad;

@Repository
public interface SquadDao extends CrudRepository<Squad, Long>
{
    Squad findByName(String name);
}
