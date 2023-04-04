package terminal.model.ata276;

import lombok.Data;
import terminal.model.enums.CityIsTheCompany;

import javax.persistence.*;

@Entity
@Data
public class Company
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tittle;
    private int numberEmployee;
    @Enumerated(EnumType.STRING)
    private CityIsTheCompany cityIsTheCompany;
}
