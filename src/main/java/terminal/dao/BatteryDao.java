package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata276.Battery;

@Repository
public interface BatteryDao extends CrudRepository<Battery, Long>
{

}
