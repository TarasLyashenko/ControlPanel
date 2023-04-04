package terminal.model.ata278;

import lombok.Data;
import terminal.model.enums.TypeQuest;

import javax.persistence.*;

@Data
@Entity
public class Quest
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private int price;
    @Enumerated(EnumType.STRING)
    private TypeQuest typeQuest;
    private String shortDescription;
    @OneToOne
    @JoinColumn(name = "scenario_id")
    private Scenario scenario;
}
