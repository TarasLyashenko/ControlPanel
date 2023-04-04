package terminal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Employee;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long>
{
    @Query("SELECT e FROM Employee e WHERE e.mentalStatus = 'HEALTHY'")
    List<Employee> findMentalUnhealthy();
}
