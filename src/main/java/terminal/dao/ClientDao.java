package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata287.Client;

@Repository
public interface ClientDao extends CrudRepository<Client, Long>
{
    Client findByName(String name);
}
