package terminal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Animal;
import terminal.model.Employee;
import terminal.model.Product;

import java.util.List;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long>
{
    @Query("SELECT e FROM Employee e WHERE e.mentalStatus = 'HEALTHY' AND physicalStatus = 'HEALTHY'")
    List<Employee> findFullHealthyPeople();

    @Query("SELECT e FROM Employee e WHERE e.physicalStatus = 'HEALTHY'")
    List<Employee> findPhysicallyUnhealthy();

    @Query("SELECT e FROM Employee e WHERE e.mentalStatus = 'HEALTHY'")
    List<Employee> findMentalUnhealthy();
}
