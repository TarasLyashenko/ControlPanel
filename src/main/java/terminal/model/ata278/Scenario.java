package terminal.model.ata278;

import lombok.Data;
import terminal.model.enums.QuestReadinessStatus;

import javax.persistence.*;

@Data
@Entity
public class Scenario
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int numberOfCharacter;
    private String scriptText;
    @Enumerated(EnumType.STRING)
    private QuestReadinessStatus questReadinessStatus;
    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
