package terminal.rowmappers;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import terminal.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeRowMapper implements RowMapper<Employee>
{
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException
    {
        Employee employee = new Employee();
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String gender = resultSet.getString("gender");
        int age = resultSet.getInt("age");
        String assignment = resultSet.getString("assignment");
        String fingerprint = resultSet.getString("fingerprint");
        String physicalStatus = resultSet.getString("physicalStatus");
        String mentalStatus = resultSet.getString("mentalStatus");

        employee.setId(id);
        employee.setName(name);
        employee.setGender(gender);
        employee.setAge(age);
        employee.setAssignment(assignment);
        employee.setFingerprint(fingerprint);
        employee.setPhysicalStatus(physicalStatus);
        employee.setMentalStatus(mentalStatus);

        return employee;
    }
}
