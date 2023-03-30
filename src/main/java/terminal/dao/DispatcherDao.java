package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.airport.Dispatcher;

@Repository
public interface DispatcherDao extends CrudRepository<Dispatcher, Long>
{
}
