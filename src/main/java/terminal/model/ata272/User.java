package terminal.model.ata272;

import lombok.Data;
import terminal.model.ata273.Passport;
import terminal.model.ata274.AccessCard;
import terminal.model.ata275.MedicalCard;

import javax.persistence.*;

@Data
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "smartphone_id")
    private Smartphone smartphone;

    @OneToOne
    @JoinColumn(name = "passport_id")
    private Passport passport;

    @OneToOne
    @JoinColumn(name = "accessCard_id")
    private AccessCard accessCard;

    @OneToOne
    @JoinColumn(name = "medicalCard_id")
    private MedicalCard medicalCard;
}
