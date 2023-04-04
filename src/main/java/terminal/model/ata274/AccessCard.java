package terminal.model.ata274;

import lombok.Data;
import terminal.model.enums.AccessCardAccessLevel;
import terminal.model.enums.ComputerGameStatus;

import javax.persistence.*;

@Entity
@Data
public class AccessCard
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String color;
    private String title;
    @Enumerated(EnumType.STRING)
    private AccessCardAccessLevel accessLevel;
}
