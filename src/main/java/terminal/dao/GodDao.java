package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata279.God;

@Repository
public interface GodDao extends CrudRepository<God, Long>
{

}
