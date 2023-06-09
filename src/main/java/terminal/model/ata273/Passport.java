package terminal.model.ata273;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Passport
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int number;
    private String dateOfIssue;
    private String nationality;
}
