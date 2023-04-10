package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata286.Pilot;

@Repository
public interface PilotDao extends CrudRepository<Pilot, Long>
{
    Pilot findByName(String name);
}
