package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata274.AccessCard;

public interface AccessCardDao extends CrudRepository<AccessCard, Long>
{
}
