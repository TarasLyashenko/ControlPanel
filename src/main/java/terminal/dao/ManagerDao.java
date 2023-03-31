package terminal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.computerClub.Computer;
import terminal.model.computerClub.Manager;

import java.util.List;

@Repository
public interface ManagerDao extends CrudRepository<Manager, Long>
{
    @Query("SELECT m FROM Manager m WHERE m.currentState != 'WORKS'")
    List<Manager> findLayoff();

    @Query("SELECT m FROM Manager m WHERE m.currentState = 'WORKS'")
    List<Manager> findWorkers();
}
