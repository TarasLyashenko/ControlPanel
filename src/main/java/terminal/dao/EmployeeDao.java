package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Employee;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long>
{
        List<Employee> findByPhysicalStatus(String physicalStatus);
        List<Employee> findByMentalStatus(String mentalStatus);
}
