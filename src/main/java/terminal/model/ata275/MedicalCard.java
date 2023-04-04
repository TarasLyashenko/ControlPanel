package terminal.model.ata275;

import lombok.Data;
import terminal.model.enums.EmployeePhysicalStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class MedicalCard
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private EmployeePhysicalStatus currentState;

    private String nextAccessDate;
    private LocalDateTime whetherHospitalizationRequired;
}
