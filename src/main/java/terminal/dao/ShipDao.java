package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.spiderClan.Ship;

@Repository
public interface ShipDao extends CrudRepository<Ship, Long>
{

}
