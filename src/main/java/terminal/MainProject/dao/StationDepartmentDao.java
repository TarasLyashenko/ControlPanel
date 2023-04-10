package terminal.MainProject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.MainProject.enumStation.DepartmentTypes;
import terminal.MainProject.model.StationDepartment;

@Repository
public interface StationDepartmentDao extends CrudRepository<StationDepartment, Long>
{
    StationDepartment findByDepartmentTypes(DepartmentTypes departmentTypes);
}
