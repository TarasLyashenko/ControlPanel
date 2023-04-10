package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata284.Actor;

@Repository
public interface ActorDao extends CrudRepository<Actor, Long>
{
    Actor findByName(String name);
}
