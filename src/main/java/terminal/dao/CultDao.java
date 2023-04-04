package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata279.Cult;

@Repository
public interface CultDao extends CrudRepository<Cult, Long>
{

}
