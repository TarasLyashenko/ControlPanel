package terminal.model;

import lombok.Data;
import terminal.model.enums.EmployeeGender;
import terminal.model.enums.EmployeeMentalStatus;
import terminal.model.enums.EmployeePhysicalStatus;

import javax.persistence.*;

@Entity
@Data
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private EmployeeGender gender;
    private int age;
    private String assignment;
    private String fingerprint;
    @Enumerated(EnumType.STRING)
    private EmployeePhysicalStatus physicalStatus;
    @Enumerated(EnumType.STRING)
    private EmployeeMentalStatus mentalStatus;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                gender + " | " +
                age + " | " +
                assignment + " | " +
                fingerprint + " | " +
                physicalStatus + " | " +
                mentalStatus;
    }
}
