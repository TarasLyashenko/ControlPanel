package terminal.model.ata279;

import lombok.Data;
import terminal.model.enums.TypeofCult;

import javax.persistence.*;

@Entity
@Data
public class Cult
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String tagline;
    private int numberConvertPeople;
    private boolean godIsCalled;
    @Enumerated(EnumType.STRING)
    private TypeofCult typeofCult;
    @OneToOne
    @JoinColumn(name = "god_id")
    private God god;
}