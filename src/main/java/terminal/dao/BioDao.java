package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata277.Bio;

@Repository
public interface BioDao extends CrudRepository<Bio, Long>
{
}
