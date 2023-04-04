package terminal.model.ata279;

import lombok.Data;
import terminal.model.enums.CultistMethodConvert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Cultist
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private LocalDateTime timeToAppeals;
    private int howManyPeopleConvert;
    private boolean alive;
    @Enumerated(EnumType.ORDINAL)
    private CultistMethodConvert cultistMethodConvert;
    @OneToOne
    @JoinColumn(name = "cult_id")
    private Cult cult;
}
