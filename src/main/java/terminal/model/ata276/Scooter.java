package terminal.model.ata276;

import lombok.Data;
import terminal.model.enums.ScooterColor;

import javax.persistence.*;

@Data
@Entity
public class Scooter
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private boolean power;
    private String model;
    @Enumerated(EnumType.STRING)
    private ScooterColor color;
    @OneToOne
    @JoinColumn(name = "battery_id")
    private Battery battery;
}
