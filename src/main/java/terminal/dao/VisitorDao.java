package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata285.Visitor;

@Repository
public interface VisitorDao extends CrudRepository<Visitor, Long>
{
    Visitor findByName(String name);
}
