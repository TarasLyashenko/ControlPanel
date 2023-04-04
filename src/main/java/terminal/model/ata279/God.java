package terminal.model.ata279;

import lombok.Data;
import terminal.model.enums.TypeOfBloodGod;
import terminal.model.enums.TypeofCult;

import javax.persistence.*;

@Entity
@Data
public class God
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nameOfGod;
    private String godsWords;
    private String description;
    @Enumerated(EnumType.STRING)
    private TypeOfBloodGod typeOfBloodGod;
    private int numberOfCaptureSouls;
}
