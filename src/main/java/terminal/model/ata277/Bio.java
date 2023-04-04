package terminal.model.ata277;

import lombok.Data;
import terminal.model.enums.DirectorAddiction;

import javax.persistence.*;

@Data
@Entity
public class Bio
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String yearOfBirth;
    private String placeOfBirth;
    @Enumerated(EnumType.STRING)
    private DirectorAddiction addiction;
}
