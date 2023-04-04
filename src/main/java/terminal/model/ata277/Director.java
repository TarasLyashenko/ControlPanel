package terminal.model.ata277;

import lombok.Data;
import terminal.model.enums.DirectorVitalStatus;

import javax.persistence.*;

@Data
@Entity
public class Director
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private DirectorVitalStatus liveStatus;
    @OneToOne
    @JoinColumn(name = "bio_id")
    private Bio bio;
}
