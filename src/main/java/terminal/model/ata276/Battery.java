package terminal.model.ata276;

import lombok.Data;
import terminal.model.enums.BatteryLevelCharge;

import javax.persistence.*;

@Data
@Entity
public class Battery
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    @Enumerated(EnumType.STRING)
    private BatteryLevelCharge levelCharge;
    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
