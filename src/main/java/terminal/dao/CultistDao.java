package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata279.Cultist;

@Repository
public interface CultistDao extends CrudRepository<Cultist, Long>
{
}
