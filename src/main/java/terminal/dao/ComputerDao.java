package terminal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Employee;
import terminal.model.computerClub.Computer;

import java.util.List;

@Repository
public interface ComputerDao extends CrudRepository<Computer, Long>
{
    @Query("SELECT c FROM Computer c WHERE c.whatGameStart = 'SPACE_STATION' AND power = '1'")
    List<Computer> findWhoPlaysTheStation();

    @Query("SELECT c FROM Computer c WHERE c.whatGameStart != 'SPACE_STATION' AND power = '1'")
    List<Computer> findWhoDontPlayTheBest();

}
