package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata276.Scooter;

@Repository
public interface ScooterDao extends CrudRepository<Scooter, Long>
{

}
