package terminal.MainProject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.MainProject.model.Worker;

@Repository
public interface WorkerDao extends CrudRepository<Worker, Long>
{
    Worker findByName(String name);
}
