package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long>
{

}
