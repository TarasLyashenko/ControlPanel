package terminal.model;

import lombok.Data;
import terminal.model.ata275.MedicalCard;
import terminal.model.enums.EmployeeGender;
import terminal.model.enums.EmployeeMentalStatus;

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
    private EmployeeMentalStatus mentalStatus;
    @OneToOne
    @JoinColumn(name = "medical_card_id")
    private MedicalCard medicalCard;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                gender + " | " +
                age + " | " +
                assignment + " | " +
                fingerprint + " | " +
                mentalStatus + " | " +
                medicalCard;
    }
}
