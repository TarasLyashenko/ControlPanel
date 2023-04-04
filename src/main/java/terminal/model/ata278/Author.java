package terminal.model.ata278;

import lombok.Data;
import terminal.model.enums.AuthorSpecialization;

import javax.persistence.*;

@Entity
@Data
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private double workExperience;
    @Enumerated(EnumType.STRING)
    private AuthorSpecialization authorSpecialization;
}
